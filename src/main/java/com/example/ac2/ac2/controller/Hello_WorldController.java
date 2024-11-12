package com.example.ac2.ac2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello_WorldController {
	@GetMapping("/example")
    public String example() {
        return "Hello, World!";
    }

}
