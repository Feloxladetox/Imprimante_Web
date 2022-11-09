package com.example.appliweb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppliWebcontroller {

    @GetMapping("/bonjour")
    public String hello()
    {
        return "hello world";
    }
}
