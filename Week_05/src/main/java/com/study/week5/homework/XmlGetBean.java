package com.study.week5.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: JAVA-000
 * @description: xml获取bean
 * @author: zhaoshunli
 * @date: 2020-11-16 11:05
 **/
public class XmlGetBean {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        XmlGetBean xmlGetBean = (XmlGetBean) context.getBean("xmlGetBean");
        System.out.println(xmlGetBean.printDesc("这个bean是通过xml配置创建的"));
    }

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String printDesc(String detail){
        return new StringBuffer().append(detail).append("————————").append(this.desc).toString();
    }
}
