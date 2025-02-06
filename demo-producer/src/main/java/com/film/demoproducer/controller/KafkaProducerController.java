package com.film.demoproducer.controller;

import com.film.demoproducer.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/producers")
@RequiredArgsConstructor
public class KafkaProducerController {
    private final KafkaProducerService kafkaProducerService;

    @PostMapping("send")
    public void sendMessage(@RequestParam("message") String message) {
        kafkaProducerService.sendMessage("test-topic", message);
    }
}
