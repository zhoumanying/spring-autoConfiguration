package com.sixstar;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.sixstar")
public class HelloProperties {

    private String name = "Alan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
