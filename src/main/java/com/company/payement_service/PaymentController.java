package com.company.payement_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("/")
    public String home() {
        return "Payment Service is Running Successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Healthy";
    }

    @GetMapping("/version")
    public String version() {
        return "Payment Service Version 1.0";
    }
}