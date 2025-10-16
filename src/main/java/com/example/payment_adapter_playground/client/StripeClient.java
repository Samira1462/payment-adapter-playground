package com.example.payment_adapter_playground.client;


import org.springframework.stereotype.Component;

@Component
public class StripeClient {
    public void charge(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}