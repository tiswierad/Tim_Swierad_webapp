package com.timswierad.webapphome.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/")
public class MainPageController {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping({ "/" })
    public String forward() {
        return "forward:/index.html";
    }
}