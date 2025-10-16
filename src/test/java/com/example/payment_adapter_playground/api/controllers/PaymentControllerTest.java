package com.example.payment_adapter_playground.api.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class PaymentControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void payPalAdapterPayment() throws Exception {
        mockMvc.perform(post("/api/payments/paypaladapter")
                        .param("amount", "100"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Payment done via paypaladapter")));
    }

    @Test
    public void stripeAdapterPayment() throws Exception {
        mockMvc.perform(post("/api/payments/stripeadapter")
                        .param("amount", "200"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Payment done via stripeadapter")));
    }

    @Test
    public void unsupportedGateway() throws Exception {
        mockMvc.perform(post("/api/payments/unknownadapter")
                        .param("amount", "100"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Unsupported payment gateway")));
    }
}