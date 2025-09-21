package com.developer.compsTFT.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/units")
public class UnitsController {

    @PostMapping
    public String setUnitsDb(){
        return "Units setted";
    }
}
