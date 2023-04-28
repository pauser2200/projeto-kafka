package com.paulo.strprducer.services;

import ch.qos.logback.classic.spi.EventArgUtil;
import com.sun.net.httpserver.Authenticator;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.CompletableFuture;
@Log4j2
@Service
@RequiredArgsConstructor
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        log.info("Mensagem enviada {}", message);
        kafkaTemplate.send("str-topic",message);
        //CompletableFuture<SendResult<String, String>> future =
//        future.whenComplete((result, ex) -> {
//            if (ex == null) {
//                log.info("Send message with sucess {} ", message);
//                log.info("Partition {}", result.getRecordMetadata().partition());
//
//            } else {
//                log.error("Error send message");
//            }
//        });

    }
}
