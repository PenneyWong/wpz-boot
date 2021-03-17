package com.wpz.system.modules.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
@Api("Start")
@RestController
@RequestMapping("/start")
public class Start {

    @Resource
    private RedisTemplate redisTemplate;

    @ResponseBody
    @ApiOperation(value = "Hello World")
    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String start() {

        ValueOperations ops = redisTemplate.opsForValue();

        ops.set("hello", "wangpengzhen");

        Object o = ops.get("hello");

        return (String) o + "Hello World";
    }

    @ResponseBody
    @ApiOperation(value = "Map Output")
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Map<String, Object> getMap() {

        Map<String, Object> user = new HashMap<String, Object>();

        user.put("姓名", "王彭真");
        user.put("年龄", "27");
        user.put("性别", "男");

        return user;
    }
}