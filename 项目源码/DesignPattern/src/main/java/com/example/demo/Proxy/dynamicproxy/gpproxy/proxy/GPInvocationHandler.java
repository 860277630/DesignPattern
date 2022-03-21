package com.example.demo.Proxy.dynamicproxy.gpproxy.proxy;

import java.lang.reflect.Method;

public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable;
}
