package com.film.demoproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.film.demoproducer.constant.KafkaConstant.GROUP_ID;
import static com.film.demoproducer.constant.KafkaConstant.TEST_TOPIC;

@Slf4j
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = TEST_TOPIC, groupId = GROUP_ID)
    public void listen(ConsumerRecord<String, String> consumerRecord) {
        log.info(
                "Received message: message: {}, partition id: {}, offset: {}",
                consumerRecord.value(),
                consumerRecord.partition(),
                consumerRecord.offset()
        );
    }
}
