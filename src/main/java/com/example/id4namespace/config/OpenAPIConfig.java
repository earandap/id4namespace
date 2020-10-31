package com.example.id4namespace.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration

public class OpenAPIConfig {

    private final BuildProperties properties;

    @Bean
    public OpenAPI getApiInfo() {

        return new OpenAPI()
            .info(new Info()
                .title("Namespace API")
                .description("Produce identifiers that are unique within a given namespace")
                .version(properties.getVersion())
            );
    }
}
