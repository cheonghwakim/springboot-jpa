package com.bithumb.api.config;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "*")
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // /* : 경로의 바로 하위에 있는 모든 경로 매핑. /** : 경로의 모든 하위 경로(디렉토리) 매핑
                .allowedOrigins("http://127.0.0.1:8080")
                .allowedOrigins("http://localhost:8080");
    }
}
