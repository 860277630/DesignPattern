package com.example.demo.single.Hungry;

public class Hungry2 {
    public static void main(String[] args) {
        //测试
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//饿汉式（静态代码块）
class Singleton1 {
    //1.构造器私有化 ，防止外部new创建
    private Singleton1() {
    }

    //2.本类内部创建对象实例
    private static Singleton1 instance;

    //在静态代码块中创建单例对象
    static {
        instance = new Singleton1();
    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance() {
        return instance;
    }
}
