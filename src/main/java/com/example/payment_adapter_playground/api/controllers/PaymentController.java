package com.example.payment_adapter_playground.api.controllers;


import com.example.payment_adapter_playground.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/{gateway}")
    public ResponseEntity<String> pay(
            @PathVariable String gateway,
            @RequestParam double amount) {

        paymentService.pay(gateway, amount);
        return ResponseEntity.ok("Payment done via " + gateway);
    }
}
