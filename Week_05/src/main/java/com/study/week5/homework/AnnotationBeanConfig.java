package com.study.week5.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: JAVA-000
 * @description: Autowired注解获取bean
 * @author: zhaoshunli
 * @date: 2020-11-16 11:14
 **/
@ComponentScan
public class AnnotationBeanConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationBeanConfig.class);
        AnnotationBean annotationBean = context.getBean(AnnotationBean.class);
        System.out.println(annotationBean.desc());
        AutowiredService autowiredService = (AutowiredService)context.getBean("autowiredService");
        autowiredService.printResult();
        ResourceService resourceService = (ResourceService)context.getBean("resourceService");
        resourceService.printResult();
    }
}
