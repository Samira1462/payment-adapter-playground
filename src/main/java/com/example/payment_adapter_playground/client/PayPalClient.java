package com.example.payment_adapter_playground.client;

import org.springframework.stereotype.Component;

@Component
public class PayPalClient {
    public void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
