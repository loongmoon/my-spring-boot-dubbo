package com.zhao.demo.server.controller;

import com.zhao.demo.facade.hello.SecondService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Reference(version = "1.0.0", check = false)
    private SecondService secondService;

    @RequestMapping("/")
    public String index() {
        return "server:" + secondService.cry("lisi");
    }
}
