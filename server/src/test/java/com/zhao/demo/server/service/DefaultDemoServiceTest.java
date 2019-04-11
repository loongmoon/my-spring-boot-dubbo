package com.zhao.demo.server.service;

import com.zhao.demo.facade.hello.DemoService;
import com.zhao.demo.server.Application;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class DefaultDemoServiceTest {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @Test
    public void sayHello() {
        String word = demoService.sayHello();
        System.out.println(word);
    }
}
