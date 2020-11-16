package com.study.week5.homework;

/**
 * @program: JAVA-000
 * @description:
 * @author: zhaoshunli
 * @date: 2020-11-16 13:15
 **/
public class BeanAnnotation {

    private String beanDesc;

    public void dealMethod(){
        System.out.println("这是bean通过@Bean注解创建的");
    }
    public String getBeanDesc() {
        return beanDesc;
    }

    public void setBeanDesc(String beanDesc) {
        this.beanDesc = beanDesc;
    }
}
