package com.example.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    public Car c;

    public User() {
        System.out.println("This is from User");

    }

    public void isCallingCar() {
        c.CarMethod();
        System.out.println("This is the name of the Car " + c.name);
    }
}
