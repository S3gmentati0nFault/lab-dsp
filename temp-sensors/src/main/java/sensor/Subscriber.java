package sensor;

import org.eclipse.paho.client.mqttv3.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subscriber {
    public static void main(String[] args) {
        MqttClient client;
        String broker = "tcp://localhost:1883";
        String clientId = MqttClient.generateClientId();
        String recievingTopic = "home/sensor/#";
        String publishingTopic = "home/controllers/temp";
        List<Double> temps =
                new ArrayList<Double>();

        int qos = 2;

        try {
            client =
                    new MqttClient(broker, clientId);

            MqttConnectOptions connOpts =
                    new MqttConnectOptions();

            connOpts.setCleanSession(true);

            System.out.println(clientId + " Connecting Broker " + broker);
            client.connect(connOpts);
            System.out.println(clientId + " Connected - Thread PID: " + Thread.currentThread().getId());

            client.setCallback(new MqttCallback() {

                public void messageArrived(String recievingTopic, MqttMessage message)
                        throws MqttException {

                    String time =
                            new Timestamp(System.currentTimeMillis()).toString();

                    double receivedMessage = Double.parseDouble(
                            new String(message.getPayload()));

                    System.out.println(clientId
                            + " Received a Message! - Callback - Thread PID: "
                            + Thread.currentThread().getId()
                            + "\n\tTime:    " + time
                            + "\n\tTopic:   " + recievingTopic
                            + "\n\tMessage: " + receivedMessage
                            + "\n\tQoS:     " + message.getQos() + "\n");

                    System.out.println("\n ***  Press a random key to exit *** \n");

                    if(temps.size() == 5){
                        temps.remove(0);
                    }
                    temps.add(receivedMessage);

                    if(temps.size() == 5){
                        double avg = 0.0;
                        for(Double current : temps) {
                            if (current != null) {
                                avg += current;
                            }
                        }
                        avg /= 5;
                        System.out.println(avg);

                        if(avg > 20.0){
                            String payload = "off";
                            MqttMessage powerOff = new MqttMessage(payload.getBytes());
                            client.publish(publishingTopic, powerOff);
                        }
                        else{
                            String payload = "on";
                            MqttMessage powerOn = new MqttMessage(payload.getBytes());
                            client.publish(publishingTopic, powerOn);
                        }
                    }
                }

                public void connectionLost(Throwable cause) {
                    System.out.println(clientId + " Connectionlost! cause:" + cause.getMessage()+ "-  Thread PID: " + Thread.currentThread().getId());
                }

                public void deliveryComplete(IMqttDeliveryToken token) {
                }

            });
            System.out.println(clientId + " Subscribing ... - Thread PID: " + Thread.currentThread().getId());
            client.subscribe(recievingTopic,qos);
            System.out.println(clientId + " Subscribed to topic : " + recievingTopic);


            System.out.println("\n ***  Press a random key to exit *** \n");
            Scanner command = new Scanner(System.in);
            command.nextLine();
            client.disconnect();

        } catch (MqttException me ) {
            System.out.println("reason " + me.getReasonCode());
            System.out.println("msg " + me.getMessage());
            System.out.println("loc " + me.getLocalizedMessage());
            System.out.println("cause " + me.getCause());
            System.out.println("excep " + me);
            me.printStackTrace();
        }
    }
}
