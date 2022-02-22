package com.example.demo.single.Hungry;


import java.lang.reflect.Constructor;

public class Hungry1 {
    public static void main(String[] args) {
        //测试
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());


    }
}

//饿汉式（静态变量）
class Singleton {
    //1.构造器私有化 ，防止外部new创建
    private Singleton() {
    }
    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();
    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
