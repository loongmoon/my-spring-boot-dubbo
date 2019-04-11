package com.zhao.demo.provider.service;

import com.zhao.demo.facade.hello.SecondService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class ProviderServiceImpl implements SecondService {

    public String cry(String name) {
        return name + ":5555!";
    }
}