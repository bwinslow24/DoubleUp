package com.fantasy.doubleup.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DoubleUpController {

    @RequestMapping("/")
    public String index() {
        return "Fantasy Bitch";
    }

}
