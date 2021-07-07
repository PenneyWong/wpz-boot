package com.wpz.system.aop;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopController {

    @GetMapping("/test")
    public String aopTest(@RequestParam(name = "name") String name){

        return  name+"AOP Test";
    }
}
