package sensor;

import org.eclipse.paho.client.mqttv3.*;

import javax.xml.crypto.Data;
import java.sql.Timestamp;

/**
 * Main test class.
 */
public class Main {
    /**
     * Main method for the test class, it handles the subscription to the MQTT topics.
     * 
     * @throws InterruptedException Unhandled exception thrown somewhere.
     */
    public static void main(String[] args) throws InterruptedException {
            MqttClient client;
            String broker = "tcp://localhost:1883";
            String clientId = MqttClient.generateClientId();
            String recievingTopic = "home/sensor/#";
            int qos = 1;
            SimpleThread st = new SimpleThread();
            st.start();

            try {
                client =
                        new MqttClient(broker, clientId);

                MqttConnectOptions connOpts =
                        new MqttConnectOptions();

                DataStructure.getInstance();

                connOpts.setCleanSession(false);

                System.out.println(clientId + " Connecting Broker " + broker);
                client.connect(connOpts);
                System.out.println(clientId + " Connected - Thread PID: " + Thread.currentThread().getId());

                client.setCallback(new MqttCallback() {
                    public void messageArrived(String recievingTopic, MqttMessage message)
                            throws MqttException, InterruptedException {

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

                        System.out.println("\n Adding to the structure \n");
                        DataStructure.getInstance().add(receivedMessage);
                    }

                    public void connectionLost(Throwable cause) {
                        System.out.println(clientId + " Connection lost! cause:" + cause.getMessage()+ "-  Thread PID: " + Thread.currentThread().getId());
                    }

                    public void deliveryComplete(IMqttDeliveryToken token) {
                        System.out.println("Delivery complete");
                    }
                });
                System.out.println(clientId + " Subscribing ... - Thread PID: " + Thread.currentThread().getId());
                client.subscribe(recievingTopic,qos);
                System.out.println(clientId + " Subscribed to topic : " + recievingTopic);

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
