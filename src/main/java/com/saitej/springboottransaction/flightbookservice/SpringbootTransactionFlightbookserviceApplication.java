package com.saitej.springboottransaction.flightbookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootTransactionFlightbookserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTransactionFlightbookserviceApplication.class, args);
    }

}
