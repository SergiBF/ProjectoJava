package com.it2022.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String Hello(){

        return "Hey";
    }

}
