package com.zhao.demo.server.service;

import com.zhao.demo.facade.hello.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class DefaultDemoService implements DemoService {

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    public String sayHello() {
        return String.format("[%s] : Hello, %s", serviceName, "zhangsans");
    }
}