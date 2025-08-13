package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppClass {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        SpringApplication.run(AppClass.class,args);
        System.err.println("Welcome to our spring app!!!!");
    }
}
