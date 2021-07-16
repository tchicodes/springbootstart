package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootMainApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootMainApp.class, args);

//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String beanName : beanDefinitionNames) {
//            System.out.println(beanName);
//        }
    }

}
