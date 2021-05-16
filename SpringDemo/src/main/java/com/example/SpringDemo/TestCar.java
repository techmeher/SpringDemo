package com.example.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestCar {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(TestCar.class, args);
        User u = ac.getBean(User.class);
        u.isCallingCar();
    }
}
