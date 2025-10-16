package com.example.payment_adapter_playground.adapter;

import com.example.payment_adapter_playground.client.PayPalClient;
import com.example.payment_adapter_playground.gateway.PaymentGateway;
import org.springframework.stereotype.Component;

@Component
public class PayPalAdapter implements PaymentGateway {

    private final PayPalClient payPalClient;

    public PayPalAdapter(PayPalClient payPalClient) {
        this.payPalClient = payPalClient;
    }

    @Override
    public void pay(double amount) {
        payPalClient.makePayment(amount);
        System.out.println("Paid using PayPal adapter");
    }
}
