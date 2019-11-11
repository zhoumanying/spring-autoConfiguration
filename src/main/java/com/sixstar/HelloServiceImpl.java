package com.sixstar;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceImpl implements HelloService{
    @Autowired
    private HelloProperties helloProperties;
    @Override
    public void sayHello() {
        System.out.println(helloProperties.getName()+" :hello world!");
    }
}
