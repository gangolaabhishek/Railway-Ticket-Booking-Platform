package com.railway.user_service.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI railwayOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("Railway User Service")
                        .version("1.0")
                        .description("Railway Ticket Booking Platform - User Service"));
    }
}
