package com.study.week5.homework;

import org.springframework.stereotype.Component;

/**
 * @program: JAVA-000
 * @description:
 * @author: zhaoshunli
 * @date: 2020-11-16 11:14
 **/
@Component
public class AnnotationBean {

    public String desc() {
        return "这个bean是通过注解创建的";
    }
}
