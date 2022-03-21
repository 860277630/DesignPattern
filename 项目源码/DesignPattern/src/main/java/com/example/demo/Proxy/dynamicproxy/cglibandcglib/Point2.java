package com.example.demo.Proxy.dynamicproxy.cglibandcglib;

public class Point2 implements Point {
    @Override
    public Object proceed(Chain chain) {
        System.out.println("point 2 before");
        Object result = chain.proceed();
        System.out.println("point 2 after");
        return result;
    }
}
