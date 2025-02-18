package com.github.phoa05.study_apix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class ControllerPing {

    @GetMapping
    public String ping(){
        return "pong";
    }
}
