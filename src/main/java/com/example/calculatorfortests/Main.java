package com.example.calculatorfortests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        SpringApplication.run(Controller.class, args);

    }





}