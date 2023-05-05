package sensor;

import org.eclipse.paho.client.mqttv3.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Heater {
    public static void main(String[] args) {
        MqttClient client;
        String broker = "tcp://localhost:1883";
        String clientId = MqttClient.generateClientId();
        String topic = "home/controllers/temp";
        int qos = 2;

        try {
            client =
                    new MqttClient(broker, clientId);

            MqttConnectOptions connOpts =
                    new MqttConnectOptions();

            connOpts.setCleanSession(true);

            System.out.println(clientId + " Connecting Broker " + broker);
            client.connect(connOpts);
            System.out.println(clientId + " Connected - Thread PID: "
                    + Thread.currentThread().getId());

            client.setCallback(new MqttCallback() {

                public void messageArrived(String recievingTopic, MqttMessage message)
                        throws MqttException {

                    String time =
                            new Timestamp(System.currentTimeMillis()).toString();

                    String receivedMessage =
                            new String(message.getPayload());

                    System.out.println(clientId +" Received a Message! - Callback - Thread PID: "
                            + Thread.currentThread().getId()
                            + "\n\tTime:    " + time
                            + "\n\tTopic:   " + recievingTopic
                            + "\n\tMessage: " + receivedMessage
                            + "\n\tQoS:     " + message.getQos() + "\n");

                    System.out.println("\n ***  Press a random key to exit *** \n");

                    if(receivedMessage.equalsIgnoreCase("off")){
                        System.out.println("THE HEATER WAS POWERED OFF");
                    }
                    else if(receivedMessage.equalsIgnoreCase("on")){
                        System.out.println("THE HEATER WAS POWERED ON");
                    }
                }

                public void connectionLost(Throwable cause) {
                    System.out.println(clientId + " Connectionlost! cause:" + cause.getMessage()
                            + "-  Thread PID: " + Thread.currentThread().getId());
                }

                public void deliveryComplete(IMqttDeliveryToken token) {
                }

            });
            System.out.println(clientId
                    + " Subscribing ... - Thread PID: "
                    + Thread.currentThread().getId());

            client.subscribe(topic, qos);
            System.out.println(clientId + " Subscribed to topic : " + topic);


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
