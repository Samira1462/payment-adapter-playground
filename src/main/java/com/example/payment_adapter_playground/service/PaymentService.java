package com.example.payment_adapter_playground.service;

import com.example.payment_adapter_playground.gateway.PaymentGateway;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PaymentService {

    private final Map<String, PaymentGateway> gateways;

    public PaymentService(List<PaymentGateway> gatewayList) {
        this.gateways = gatewayList.stream()
                .collect(Collectors.toMap(g -> g.getClass().getSimpleName().toLowerCase(), g -> g));
    }

    public void pay(String gatewayName, double amount) {
        PaymentGateway gateway = gateways.get(gatewayName.toLowerCase());
        if (gateway == null) {
            throw new IllegalArgumentException("Unsupported payment gateway: " + gatewayName);
        }
        gateway.pay(amount);
    }
}