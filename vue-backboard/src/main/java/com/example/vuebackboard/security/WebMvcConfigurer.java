package com.example.vuebackboard.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080") // Replace with your frontend's origin
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true); // If you're using cookies or authentication
    }
}