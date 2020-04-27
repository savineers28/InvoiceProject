package com.aot.orders.topic;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.config.SslConfigs;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class OrderProducer {
    private final static String TOPIC = "OrderTopic";
    private final static String BOOTSTRAP_SERVER = "kafka:9092";

    public static void main(String... args) throws Exception {
        if (args.length == 0) {
            runProducer(5);
        } else {
            runProducer(Integer.parseInt(args[0]));
        }
    }

    private static Producer<Long, String> createProducer() {
        Properties settings = new Properties();
        settings.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        settings.put(ProducerConfig.CLIENT_ID_CONFIG, "com.aot.orders.topic.OrderStatusProducer");
        settings.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
        settings.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        settings.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SSL");
        /*settings.put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, "C:\\codes\\programs\\Kafka\\ssl\\client.truststore.jks");
        settings.put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, "test1234");
        settings.put(SslConfigs.SSL_KEYSTORE_LOCATION_CONFIG, "C:\\codes\\programs\\Kafka\\ssl\\server.keystore.jks");
        settings.put(SslConfigs.SSL_KEYSTORE_PASSWORD_CONFIG, "test1234");
        settings.put(SslConfigs.SSL_KEY_PASSWORD_CONFIG, "test1234");*/
        return new KafkaProducer<Long, String>(settings);
    }

    static void runProducer(final int sendMessageCount) throws Exception {
        final Producer<Long, String> producer = createProducer();
        long time = System.currentTimeMillis();

        try {
            for (long index = time; index < time + sendMessageCount; index++) {
                final ProducerRecord<Long, String> record =
                        new ProducerRecord<>(TOPIC, index,"Message - Response -" + index);

                RecordMetadata metadata = producer.send(record).get();

                long elapsedTime = System.currentTimeMillis() - time;
                System.out.printf("sent record(key=%s value=%s) " +
                                "meta(partition=%d, offset=%d) time=%d\n",
                        record.key(), record.value(), metadata.partition(),
                        metadata.offset(), elapsedTime);

            }
        } finally {
            producer.flush();
            producer.close();
        }
    }
}







