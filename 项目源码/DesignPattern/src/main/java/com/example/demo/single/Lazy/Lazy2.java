package com.example.demo.single.Lazy;

import org.junit.Test;

public class Lazy2 {
    public static void main(String[] args) {
        System.out.println(SingletonForLazy1.getInstance()
                == SingletonForLazy1.getInstance());
    }

}
class SingletonForLazy1{
    private static  SingletonForLazy1 singletonForLazy;
    //构造函数私有化
    private SingletonForLazy1(){}
    public static synchronized SingletonForLazy1 getInstance(){
        //注意这个判断一定要有 否则会重复创建，不是单例
        if(singletonForLazy == null){
            singletonForLazy = new SingletonForLazy1();
        }
        return singletonForLazy;
    }

}
