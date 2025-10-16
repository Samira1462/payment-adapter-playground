package com.example.payment_adapter_playground.adapter;

import com.example.payment_adapter_playground.client.StripeClient;
import com.example.payment_adapter_playground.gateway.PaymentGateway;
import org.springframework.stereotype.Component;

@Component
public class StripeAdapter implements PaymentGateway {

    private final StripeClient stripeClient;

    public StripeAdapter(StripeClient stripeClient) {
        this.stripeClient = stripeClient;
    }

    @Override
    public void pay(double amount) {
        stripeClient.charge(amount);
        System.out.println("Paid using Stripe adapter");
    }
}