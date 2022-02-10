package com.example.demo.single.StaticInnerClass;

//静态内部类实现方式
public class StaticInnerClass {
    public static void main(String[] args) {
        StaticInnerSingle s1 = StaticInnerSingle.getInstance();
        StaticInnerSingle s2 = StaticInnerSingle.getInstance();
        System.out.println(s1 == s2);
    }
}
class StaticInnerSingle{
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