package com.test.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinChen
 * @Title: TestController
 * @Package com.test.helloworld
 * @Description: TODO()
 * @date 2019/5/13 9:13
 * Copyright (c) 1994-2018 Scjydz.com All Rights Reserved.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "test";
    }
}
