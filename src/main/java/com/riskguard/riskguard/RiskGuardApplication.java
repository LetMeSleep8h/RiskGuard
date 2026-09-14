package com.riskguard.riskguard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RiskGuardApplication {

    public static void main(String[] args) {
        SpringApplication.run(RiskGuardApplication.class, args);
    }
}