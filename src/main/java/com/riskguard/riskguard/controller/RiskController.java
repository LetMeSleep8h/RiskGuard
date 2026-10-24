package com.riskguard.riskguard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiskController {

    @GetMapping("/api/risks")
    public String getRisks() {
        return "RiskGuard API is working!";
    }
}

