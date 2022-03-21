package com.example.demo.Proxy.dynamicproxy.cglibandcglib;

public class Point1 implements Point {
    @Override
    public Object proceed(Chain chain) {
        System.out.println("point 1 before");
        Object result = chain.proceed();
        System.out.println("point 1 after");
        return result;
    }
}



