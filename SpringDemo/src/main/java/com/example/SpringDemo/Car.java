package com.example.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    public String name = "Mercedes GLC200d";

    public Car() {
        System.out.println("this is from Car");
    }

    public void CarMethod() {
        System.out.println("this is from Car  method");
    }
}
