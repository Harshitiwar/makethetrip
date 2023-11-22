package com.example.makethetrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trai {
    @GetMapping("/Trai")
    public String getData() {
        return " Please book ticket from irctc";
    }
}