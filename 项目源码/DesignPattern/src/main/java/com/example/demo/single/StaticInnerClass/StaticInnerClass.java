package com.example.demo.single.StaticInnerClass;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;

//静态内部类实现方式
public class StaticInnerClass {
    @Test
    public void test1(){
        StaticInnerSingle s1 = StaticInnerSingle.getInstance();
        StaticInnerSingle s2 = StaticInnerSingle.getInstance();
        System.out.println(s1 == s2);
    }
    @Test
    public void test2(){
        //下面演示反射破坏静态内部类
        System.out.println("===反射破坏静态内部类===");
        try {
            Class<?> clazz = StaticInnerSingle.class;
            //构造函数私有化  但是还是被反射获取到了
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            //然后拿到构造函数  就可以利用构造函数创建任意多个对象
            Object instance1 = c.newInstance();
            Object instance2 = c.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance1 == instance2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void test3(){
        System.out.println("===不会被破坏的静态内部类===");
        try {
            Class<?> clazz = StaticInnerSingleWithoutBroken.class;
            //构造函数私有化  但是还是被反射获取到了
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            //然后拿到构造函数  就可以利用构造函数创建任意多个对象
            Object instance1 = c.newInstance();
            Object instance2 = c.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance1 == instance2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void test4()throws Exception{
        System.out.println("===序列化破坏===");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(StaticInnerSingleWithSeria.getInstance());
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        StaticInnerSingleWithSeria newInstance = (StaticInnerSingleWithSeria) ois.readObject();
        System.out.println(newInstance == StaticInnerSingleWithSeria.getInstance());
    }

}
class StaticInnerSingle {
    //构造函数私有化
    private StaticInnerSingle(){}
    //静态内部类
    private static class SingleInstance{
        private static final StaticInnerSingle instance
                = new StaticInnerSingle();
    }
    public static  StaticInnerSingle getInstance(){
        return SingleInstance.instance;
    }
}

//用于测试 反射破坏
class StaticInnerSingleWithoutBroken{
    //构造函数私有化
    private StaticInnerSingleWithoutBroken(){
        if(SingleInstance.instance != null){
            throw new RuntimeException("禁止非法访问！");
        }
    }
    private static class SingleInstance{
        private static final StaticInnerSingleWithoutBroken instance
                = new StaticInnerSingleWithoutBroken();
    }
    public static  StaticInnerSingleWithoutBroken getInstance(){
        return SingleInstance.instance;
    }
}
//用于测试  序列化破坏
class StaticInnerSingleWithSeria implements Serializable{
    //构造函数私有化
    private StaticInnerSingleWithSeria(){}
    //静态内部类
    private static class SingleInstance{
        private static final StaticInnerSingleWithSeria instance
                = new StaticInnerSingleWithSeria();
    }
    public static  StaticInnerSingleWithSeria getInstance(){
        return SingleInstance.instance;
    }
}