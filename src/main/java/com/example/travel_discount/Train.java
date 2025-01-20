package com.example.travel_discount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Train {
    @GetMapping("/Train")
    public String getData() {return  "Please book your Train ticket in New Delhi 20% discount" ; }
}