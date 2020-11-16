package com.study.week5.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: JAVA-000
 * @description:
 * @author: zhaoshunli
 * @date: 2020-11-16 13:14
 **/
@Configuration
public class BeanConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.study.week5.homework");
        BeanAnnotation beanAnnotation = (BeanAnnotation) context.getBean("beanAnnotation");
        beanAnnotation.dealMethod();
    }

    @Bean("beanAnnotation")
    public BeanAnnotation beanAnnotation(){
        return new BeanAnnotation();
    }
}
