package com.stupendousware.portfolio;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "application")
public class ApplicationConfiguration {
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        System.out.println("setting version from yaml: " + value);
        version = value;
    }
}
