package com.example.travel_discount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bus {
    @GetMapping("/Bus")
    public String getData() {return  "Please book your Bus ticket in New Delhi 20% discount" ; }
}
