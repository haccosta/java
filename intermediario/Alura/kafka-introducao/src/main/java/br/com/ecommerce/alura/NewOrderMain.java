package br.com.ecommerce.alura;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Objects;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        var producer = new KafkaProducer<String, String>(properties());

        for (int i = 0; i < 100; i++) {

            var key = UUID.randomUUID().toString();
            var value = key + ",1,100,200";
            var record = new ProducerRecord<>("ECOMMERCE_NEW_ORDER", key, value);

            Callback callback = (data, ex) -> {
                if (Objects.nonNull(ex)) {
                    ex.printStackTrace();
                    return;
                }
                System.out.println("Sucess: " + data.topic() + ":::" + data.partition() + "/" + data.offset() + "/" + data.timestamp());

            };

            producer.send(record, callback).get();
            var email = "Thank you for your order! We processing your order!";
            var emailRecord = new ProducerRecord<>("ECOMMERCE_SEND_EMAIL", key, email);
            producer.send(emailRecord, callback).get();
        }

    }

    private static Properties properties() {
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "172.19.0.5:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return properties;
    }
}