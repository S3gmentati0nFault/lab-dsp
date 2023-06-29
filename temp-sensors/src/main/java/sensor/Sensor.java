package sensor;

import extra.CustomRandom.CustomRandom;
import extra.Timer.Timer;
import org.eclipse.paho.client.mqttv3.*;

public class Sensor {
    public static void main(String[] args) {
        MqttClient client;
        String broker = "tcp://localhost:1883";
        String clientId = MqttClient.generateClientId();
        String topic = "home/sensor/temp";
        int qos = 1;


        try {
            client = new MqttClient(broker, clientId);

            while(true){
                MqttConnectOptions connOpts =
                        new MqttConnectOptions();

                connOpts.setCleanSession(false);

                System.out.println(clientId + " Connecting Broker " + broker);
                client.connect(connOpts);
                System.out.println(clientId + " Connected");

                String payload = String.valueOf(
                        CustomRandom.getInstance()
                                .rnDouble(18, 22));

                MqttMessage message =
                        new MqttMessage(payload.getBytes());

                message.setQos(qos);
                System.out.println(clientId + " Publishing message: " + payload + " ...");
                client.publish(topic, message);
                System.out.println(clientId + " Message published");

                if (client.isConnected())
                    client.disconnect();
                System.out.println("Publisher " + clientId + " disconnected");
                Timer.startTimer(5);
            }
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
