package com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;

public interface SwaggerConfig {

    default ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("salvhopenmrs Project")
                .description("API documents")
                .build();
    }

    @Bean
    public Docket apiDocket();
}
