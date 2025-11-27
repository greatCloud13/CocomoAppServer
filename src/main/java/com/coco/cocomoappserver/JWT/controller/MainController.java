package com.coco.cocomoappserver.JWT.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/")
    public String mainP(){

        return "Main Controller";
    }


}
