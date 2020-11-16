package com.study.week5.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: JAVA-000
 * @description:
 * @author: zhaoshunli
 * @date: 2020-11-16 11:26
 **/
@Service("resourceService")
public class ResourceService {

    @Resource
    private AnnotationBean annotationBean;

    public void printResult(){
        System.out.println("@Resource:"+annotationBean.desc());
    }

}
