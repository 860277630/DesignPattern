
package com.example.demo.testSingle;

public class test2 {
    public static void main(String[] args) {
        System.out.println(HungrySingle1.getInstance() == HungrySingle1.getInstance());
        System.out.println(HungrySingle2.getInstance() == HungrySingle2.getInstance());
        System.out.println(LazySingle1.getInstance() == LazySingle1.getInstance());
        System.out.println(DoubleCheckSingele.getInstance() == DoubleCheckSingele.getInstance());
        System.out.println(InnerClassSingle.getInstance() == InnerClassSingle.getInstance());
        System.out.println(EnumSingle.INSTANCE == EnumSingle.INSTANCE);
    }
}
//饿汉模式1
class HungrySingle1{
    private HungrySingle1(){};
    private static final  HungrySingle1 hungrySingle1 = new HungrySingle1();
    public static HungrySingle1 getInstance(){
        return hungrySingle1;
    }
}
//饿汉模式2
class HungrySingle2{
    private HungrySingle2(){};
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
    private LazySingle1(){};
    private static LazySingle1 lazySingle1;
    public static synchronized LazySingle1 getInstance(){
        if(lazySingle1==null){
            lazySingle1 = new LazySingle1();
        }
        return lazySingle1;
    }
}
//双重检验锁单例
class DoubleCheckSingele{
 private DoubleCheckSingele (){}
 private static volatile DoubleCheckSingele doubleCheckSingele;
 public static DoubleCheckSingele getInstance(){
     if(doubleCheckSingele == null){
         synchronized (DoubleCheckSingele.class){
             if(doubleCheckSingele == null){
                 doubleCheckSingele = new DoubleCheckSingele();
             }
         }
     }
     return doubleCheckSingele;
 }
}
//静态内部类单例
class InnerClassSingle{
    private InnerClassSingle(){};
    private static class InnerClass{
        private static final InnerClassSingle innerClassSingle = new InnerClassSingle();
    }
    public static InnerClassSingle getInstance(){
        return InnerClass.innerClassSingle;
    }
}
//枚举单例
enum EnumSingle{
    INSTANCE;
}


