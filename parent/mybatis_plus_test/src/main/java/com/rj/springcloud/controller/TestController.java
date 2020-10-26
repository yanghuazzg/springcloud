package com.rj.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author rj
 * @version 1.0
 * @date 2020-10-26 11:23
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String test(){
        return "test success...";
    }
}
