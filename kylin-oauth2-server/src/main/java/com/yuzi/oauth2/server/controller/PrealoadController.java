package com.yuzi.oauth2.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrealoadController {
    @RequestMapping("/preload")
    public String preload() {
        return "ok";
    }

}
