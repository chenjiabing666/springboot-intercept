package com.example.springbootintercept.config;

import com.example.springbootintercept.intercept.RepeatSubmitInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private RepeatSubmitInterceptor repeatSubmitInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //不拦截的uri
        final String[] commonExclude = {"/error", "/files/**"};
        registry.addInterceptor(repeatSubmitInterceptor).excludePathPatterns(commonExclude);
    }
}
