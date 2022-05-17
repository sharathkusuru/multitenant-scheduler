package com.demo.multitenant.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.demo.multitenant.interceptor.RequestInterceptor;

@Configuration
public class AppConfig implements WebMvcConfigurer
{
    //@Autowired
    //MinimalInterceptor minimalInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new RequestInterceptor());
    }
}
