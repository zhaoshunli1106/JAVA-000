package com.study.week5.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @program: JAVA-000
 * @description:
 * @author: zhaoshunli
 * @date: 2020-11-16 11:26
 **/
@Service("autowiredService")
public class AutowiredService {

    @Autowired
    private AnnotationBean annotationBean;

    public void printResult(){
        System.out.println("@Autowired:"+annotationBean.desc());
    }

}
