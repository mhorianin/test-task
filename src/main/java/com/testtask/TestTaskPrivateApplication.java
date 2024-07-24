package com.testtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestTaskPrivateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTaskPrivateApplication.class, args);
    }
}
