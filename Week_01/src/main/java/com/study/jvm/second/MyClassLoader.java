package com.study.jvm.second;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] cLassBytes = null;
        try {
            cLassBytes = Files.readAllBytes(Paths.get(new URI("file:///Users/zsl/IdeaProjects/JAVA-000/Week_01/src/main/java/com/study/jvm/second/Hello.xlass")));
            for (int i = 0; i < cLassBytes.length; i++) {
                cLassBytes[i] = (byte) (255 - cLassBytes[i]);
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return defineClass(name, cLassBytes, 0, cLassBytes.length);
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> hello = new MyClassLoader().findClass("Hello");
        Object instance = hello.newInstance();
        Method helloMethod = hello.getMethod("hello");
        helloMethod.invoke(instance);
    }
}
