package com.macrog.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.macrog.api.DemoService;

/**
 * DemoServiceImpl
 * 服务提供类
 * @author guohong
 * @date 2019/2/25
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
