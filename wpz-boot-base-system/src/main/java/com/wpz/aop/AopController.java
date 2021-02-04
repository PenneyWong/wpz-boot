package com.wpz.aop;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aop")
public class AopController {

    @GetMapping("/test")
    public String aopTest(@RequestParam(name = "name") String name){

        return  name+"AOP Test";
    }
}
