package com.example.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * @author panghu
 */
@Component
@PropertySource({"classpath:application.yml"})
@ConfigurationProperties(prefix = "test")
public class ServerSettings {

    //名称

    @NotNull
    private String name;

    private String domain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }


}
