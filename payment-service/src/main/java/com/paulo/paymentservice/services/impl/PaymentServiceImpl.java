package com.paulo.paymentservice.services.impl;

import com.paulo.paymentservice.model.Payment;
import com.paulo.paymentservice.services.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Pagamento recebido {}", payment);

    }
}
