package com.example.demo.Proxy.dynamicproxy.cglibandcglib;

public class Test {

    public static void main(String[] args) {
        SayHello proxy = (SayHello) ProxyFactory.create().getProxy(new SayHello());
        proxy.toString();
    }
}
