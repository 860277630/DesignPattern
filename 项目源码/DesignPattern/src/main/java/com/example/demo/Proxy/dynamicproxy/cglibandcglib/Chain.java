package com.example.demo.Proxy.dynamicproxy.cglibandcglib;

import java.util.List;

public class Chain {
    private List<Point> list;
    private int index = -1;
    private Object target;

    public Chain(List<Point> list, Object target) {
        this.list = list;
        this.target = target;
    }

    public Object proceed() {
        Object result;
        // ++index==0  ->1  ->2
        if (++index == list.size()) {
            result = (target.toString());
            System.err.println("Target Method invoke result : " + result);
        } else {
            Point point = list.get(index);
            result = point.proceed(this);
        }
        return result;
    }

}

