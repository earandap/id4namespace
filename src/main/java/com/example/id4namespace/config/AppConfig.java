package com.example.id4namespace.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
@Data
public class AppConfig {

    /**
     * This configuration allow you define which implementation of the id generators you will use in the app.
     *
     * @see com.example.id4namespace.service.IdGenerator
     */
    private String generator;
}
