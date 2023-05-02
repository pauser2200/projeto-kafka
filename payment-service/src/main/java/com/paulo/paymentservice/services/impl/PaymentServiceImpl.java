package com.paulo.paymentservice.services.impl;

import com.paulo.paymentservice.model.Payment;
import com.paulo.paymentservice.services.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;
    @SneakyThrows
    @Override
    public void sendPayment(Payment payment)  {
        log.info("Pagamento recebido {}", payment);
        Thread.sleep(1000);

        log.info("Enviando Pagamento....");

        kafkaTemplate.send("payment-topic", payment);

    }
}
