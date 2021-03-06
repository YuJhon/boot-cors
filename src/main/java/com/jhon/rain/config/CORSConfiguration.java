package com.jhon.rain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p>功能描述</br> 跨域资源共享配置</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName CORSConfiguration
 * @date 2017/7/3 9:28
 */
@Configuration
public class CORSConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/cors/**")
                        .allowedOrigins("http://localhost:8077")
                        .allowedMethods("PUT", "DELETE","GET")
                        .allowedHeaders("header1", "header2", "header3")
                        .exposedHeaders("header1", "header2")
                        .allowCredentials(false)
                        .maxAge(3600);
            }
        };
    }
}
