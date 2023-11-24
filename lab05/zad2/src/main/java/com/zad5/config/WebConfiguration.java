package com.zad5.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zad5.servlet.HelloServlet;

import jakarta.servlet.http.HttpServlet;

@Configuration
public class WebConfiguration {

    @Bean
    ServletRegistrationBean<HttpServlet> servletRegistrationBean() {
        return new ServletRegistrationBean<HttpServlet>(new HelloServlet(), "/");
    }
}
