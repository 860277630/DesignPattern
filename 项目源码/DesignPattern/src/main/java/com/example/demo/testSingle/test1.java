/*
package com.example.demo.testSingle;

//5种单例模式  练习
public class test1 {
    public static void main(String[] args) {
        System.out.println(HungrySingle1.getInstance() == HungrySingle1.getInstance());
        System.out.println(HungrySingle2.getInstance() == HungrySingle2.getInstance());
        System.out.println(LazySingle1.getInstance() == LazySingle1.getInstance());
        System.out.println(DoubleCheck1.getInstance() == DoubleCheck1.getInstance());
        System.out.println(StaticInnerClass.getInstance() == StaticInnerClass.getInstance());
        System.out.println(EnumSingle.INSTANCE == EnumSingle.INSTANCE);
    }
}
//饿汉模式1
class HungrySingle1{
    private HungrySingle1(){}
    private static final HungrySingle1 hungrySingle1 = new HungrySingle1();
    public static HungrySingle1 getInstance(){
        return hungrySingle1;
    }
}
//饿汉模式2
class HungrySingle2{
    private HungrySingle2 (){}
    private static HungrySingle2 hungrySingle2;
    static {
        hungrySingle2 = new HungrySingle2();
    }
    public static HungrySingle2 getInstance(){
        return hungrySingle2;
    }
}
//懒汉模式
class LazySingle1{
    private LazySingle1(){}
    private static LazySingle1 lazySingle1;
    public static synchronized LazySingle1 getInstance(){
        if(lazySingle1 == null){
            lazySingle1 = new LazySingle1();
        }
        return lazySingle1;
    }
}
//双重检验锁
class DoubleCheck1{
    private DoubleCheck1(){}
    private static volatile DoubleCheck1 doubleCheck1;
    public static DoubleCheck1 getInstance(){
        if(doubleCheck1 == null){
            synchronized (DoubleCheck1.class){
                if(doubleCheck1 == null){
                    doubleCheck1 = new DoubleCheck1();
                }
            }
        }
        return doubleCheck1;
    }
}
//静态内部类
class StaticInnerClass{
    private StaticInnerClass (){}
    private static class InnerClass{
        private static final StaticInnerClass instance = new StaticInnerClass();
    }
    public static StaticInnerClass getInstance(){
        return InnerClass.instance;
    }
}
//枚举单例模式
enum EnumSingle{
    INSTANCE;
}

*/
