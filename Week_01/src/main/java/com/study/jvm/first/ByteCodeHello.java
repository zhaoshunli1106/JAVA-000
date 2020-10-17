package com.study.jvm.first;

/**
 * @program: JAVA-000
 * @description:
 * @author: zhaoshunli
 * @date: 2020-10-17 15:02
 **/
public class ByteCodeHello {

    public static void main(String[] args) {
        System.out.println("hello,biteCode");
        for (int i = 0; i < 10; i++) {
            if (i > 3) {
                System.out.println(i + "大于3");
            } else {
                System.out.println(i + "小于或等于3");
            }
        }
    }
}
