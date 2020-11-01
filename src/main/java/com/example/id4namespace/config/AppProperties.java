package com.example.id4namespace.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.cors.CorsConfiguration;

@ConfigurationProperties(prefix = "app")
@Data
public class AppProperties {

    /**
     * This configuration allow you define which implementation of the id generators you will use in the app.
     *
     * @see com.example.id4namespace.service.IdGenerator
     */
    private String generator;

    @Getter
    private final CorsConfiguration cors = new CorsConfiguration();
}
