package com.bmlife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.bmlife.base.interceptor.UserLoginInterceptor;

@SpringBootApplication
public class BmlifeWebApplication extends WebMvcConfigurerAdapter{

	@Override
    public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new UserLoginInterceptor()).addPathPatterns("/hello");
		super.addInterceptors(registry);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BmlifeWebApplication.class, args);
	}
}
