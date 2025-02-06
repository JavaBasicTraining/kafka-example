package com.film.demoproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "test-topic", groupId = "my-group")
    public void listen(ConsumerRecord<String, String> consumerRecord) {
        log.info(
                "Received message: message: {}, partition id: {}, offset: {}",
                consumerRecord.value(),
                consumerRecord.partition(),
                consumerRecord.offset()
        );
    }
}
