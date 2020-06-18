package com.example.helloSpringBoot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Home {

    @GetMapping(path="/hello")
    public String hello()
    {
        return "Hello World";
    }

    @GetMapping(path="hello/{name}")
    public String getName(@PathVariable String name)
    {
        return "Hello "+ name;
    }
}
