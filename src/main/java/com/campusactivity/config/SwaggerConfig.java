package com.campusactivity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI campusActivityOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("校园活动平台 API")
                        .description("校园活动平台的 API 文档")
                        .version("1.0.0"));
    }
}