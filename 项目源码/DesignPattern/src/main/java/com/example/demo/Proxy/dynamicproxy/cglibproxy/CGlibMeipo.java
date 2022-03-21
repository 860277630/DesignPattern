package com.example.demo.Proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class CGlibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception{
        //相当于Proxy ，代理的工具类
        Enhancer enhancer = new Enhancer();
        //指定代理的目标类
        enhancer.setSuperclass(clazz);
        //指定什么情况下代理
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy)throws Throwable{
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }
    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }

}
