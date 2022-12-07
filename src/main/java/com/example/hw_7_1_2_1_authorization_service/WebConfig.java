package com.example.hw_7_1_2_1_authorization_service;

import com.example.hw_7_1_2_1_authorization_service.Controller.AuthorizationController;
import com.example.hw_7_1_2_1_authorization_service.Repository.UserRepository;
import com.example.hw_7_1_2_1_authorization_service.Service.AuthorizationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public AuthorizationService authorizationService(UserRepository repository){
        return new AuthorizationService(repository);
    }
    @Bean
    public AuthorizationController authorizationController(AuthorizationService service){
        return new AuthorizationController(service);
    }
    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }
    @Override
    public void addArgumentResolvers(
            List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new HeaderVersionArgumentResolver());
    }
}