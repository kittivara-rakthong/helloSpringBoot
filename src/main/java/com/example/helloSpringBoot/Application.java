package com.example.helloSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args)
    {
        System.out.print("Hello world");
        SpringApplication.run(Application.class, args);

    }
}
