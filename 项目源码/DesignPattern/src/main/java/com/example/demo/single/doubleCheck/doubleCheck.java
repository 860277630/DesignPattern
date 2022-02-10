package com.example.demo.single.doubleCheck;

public class doubleCheck {
    public static void main(String[] args) {
        DoubleCheckSingle d1 = DoubleCheckSingle.getInstance();
        DoubleCheckSingle d2 = DoubleCheckSingle.getInstance();
        System.out.println(d1 == d2);
    }
}
class DoubleCheckSingle{
    //构造函数私有化
   private  DoubleCheckSingle(){}
   private  static volatile DoubleCheckSingle doubleCheckSingle;
   public static DoubleCheckSingle getInstance(){
       if(doubleCheckSingle == null){
           synchronized (DoubleCheckSingle.class){
               if(doubleCheckSingle == null){
                   doubleCheckSingle = new DoubleCheckSingle();
               }
           }
       }
       return doubleCheckSingle;
   }
}
