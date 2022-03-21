package com.example.demo.Proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeipo implements InvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(
                clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            before();
            Object result = method.invoke(this.target, args);
            after();
            return result;
        }catch (InvocationTargetException e){
            throw e.getCause();
        }
    }

    private void after(){
        System.out.println("双方同意，开始交往");
    }

    private void before(){
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }
}
