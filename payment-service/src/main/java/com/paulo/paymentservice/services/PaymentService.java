package com.paulo.paymentservice.services;

import com.paulo.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
