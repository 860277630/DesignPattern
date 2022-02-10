package com.example.demo.single.Lazy;

//懒汉式的线程不安全形式
public class Lazy1 {
    public static void main(String[] args) {
        System.out.println(SingLetonForLazy.getInstance()
                == SingLetonForLazy.getInstance());
    }
}
class SingLetonForLazy{
    private static SingLetonForLazy instance;

    private SingLetonForLazy(){}
    //提供了一个静态的公有方法 ，当使用该方法时，才会去创建instance
    //即懒汉式
    public static SingLetonForLazy getInstance(){
        if(instance == null){
            instance = new SingLetonForLazy();
        }
        return instance;
    }
}