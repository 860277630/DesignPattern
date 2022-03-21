package com.example.demo.Proxy.dynamicproxy.cglibandcglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Interceptor implements MethodInterceptor {
    private Chain chain;

    public Interceptor(Chain chain) {
        this.chain = chain;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        return chain.proceed();
    }
}
