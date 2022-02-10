package com.example.demo.testSingle;

public class test3 {
    public static void main(String[] args) {
        System.out.println(HungrySingle1.getInstance() == HungrySingle1.getInstance());
        System.out.println(HungrySingle2.getInstance() == HungrySingle2.getInstance());
        System.out.println(DoubleCheckSingle.getInstance() == DoubleCheckSingle.getInstance());
        System.out.println(LazySingle1.getInstance() == LazySingle1.getInstance());
        System.out.println(StaticInnerClass.getInstance() == StaticInnerClass.getInstance());
        System.out.println(EnumClass.INSTANCE == EnumClass.INSTANCE);
    }
}
//饿汉模式 1
/*class HungrySingle1{
    private HungrySingle1(){}
    private static final HungrySingle1 hungrySingle1 = new HungrySingle1();
    public static HungrySingle1 getInstance(){
        return hungrySingle1;
    }
}*/
//饿汉模式 2
/*class HungrySingle2{
    private HungrySingle2 (){}
    private static HungrySingle2 hungrySingle2;
    static {
        hungrySingle2  = new HungrySingle2();
    }
    public static HungrySingle2 getInstance(){
        return hungrySingle2;
    }
}*/
//懒汉模式
/*class LazySingle1{
    private LazySingle1(){}
    private static LazySingle1 lazySingle1;
    public static synchronized  LazySingle1 getInstance(){
        if(lazySingle1 == null){
            lazySingle1 = new LazySingle1();
        }
        return lazySingle1;
    }
}*/
//双重检验锁模式
class DoubleCheckSingle{
    private DoubleCheckSingle(){}
    private static volatile DoubleCheckSingle doubleCheckSingle;
    public static DoubleCheckSingle getInstance(){
        if(doubleCheckSingle == null){
            synchronized (DoubleCheckSingle.class){
                if(doubleCheckSingle == null){
                    doubleCheckSingle = new DoubleCheckSingle();
                }
            }}
        return doubleCheckSingle;
    }
}
//静态内部类
class StaticInnerClass{
    private StaticInnerClass(){}
    private static class InnerClass{
        private static final StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
    public static StaticInnerClass getInstance(){
        return InnerClass.staticInnerClass;
    }
}
//枚举类
enum EnumClass{
    INSTANCE;
}