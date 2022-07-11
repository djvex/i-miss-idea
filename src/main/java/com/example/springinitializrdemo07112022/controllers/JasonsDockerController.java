package com.example.springinitializrdemo07112022.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JasonsDockerController {
    @GetMapping("/products")
    public String getMessage() {
        return "really cool product like a bong!";
    }
}


