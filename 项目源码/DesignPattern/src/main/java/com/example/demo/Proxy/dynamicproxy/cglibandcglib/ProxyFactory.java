package com.example.demo.Proxy.dynamicproxy.cglibandcglib;

import net.sf.cglib.proxy.Enhancer;

import java.util.ArrayList;
import java.util.List;

public class ProxyFactory {
    private ProxyFactory() {
    }

    public static ProxyFactory create() {
        return new ProxyFactory();
    }

    public Object getProxy(Object origin) {
        final Enhancer en = new Enhancer();
        en.setSuperclass(origin.getClass());
        List<Point> list = new ArrayList<>();
        list.add(new Point1());
        list.add(new Point2());
        en.setCallback(new Interceptor(new Chain(list, origin)));
        return en.create();
    }
}

