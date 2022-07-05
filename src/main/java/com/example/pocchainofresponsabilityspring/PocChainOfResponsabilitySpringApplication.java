package com.example.pocchainofresponsabilityspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PocChainOfResponsabilitySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocChainOfResponsabilitySpringApplication.class, args);
    }

}
