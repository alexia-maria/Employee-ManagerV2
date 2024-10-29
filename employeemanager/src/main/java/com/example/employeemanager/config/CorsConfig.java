package com.example.employeemanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // Permite pentru toate rutele
                        .allowedOrigins("http://localhost:4200")  // Permite doar de la frontend-ul Angular
                        .allowedMethods("GET", "POST", "PUT", "DELETE")  // Permite metodele HTTP specificate
                        .allowedHeaders("*")  // Permite toate header-ele
                        .allowCredentials(true);  // Permite trimiterea de credențiale
            }
        };
    }
}

