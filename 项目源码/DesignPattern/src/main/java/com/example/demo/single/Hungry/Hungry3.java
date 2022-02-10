package com.example.demo.single.Hungry;


//这个类是用来测试线程饿汉模式线程安全的
public class Hungry3 {
    public static void main(String[] args) {
        ticket.getInstance().setNum(50);
        for(int i = 0 ;i < 30 ; i++){
            new Thread(() ->{
                addTo100();
            },"窗口==="+ (i+1)).start();
        }
    }
    //多线程对单例属性加至100
    public static void addTo100(){
        while(true){
            int num = ticket.getInstance().getNum();
            if(num > 0){
               // System.out.println(Thread.currentThread().getName()+"正在出票"+ticket.getInstance().getNum()+"======实例为："+ticket.getInstance().hashCode());
                System.out.println(Thread.currentThread().getName()+"=======正在出票"+ticket.getInstance().getNum());
                ticket.getInstance().setNum(--num);
            }else {
                break;
            }
        }
    }
}
//饿汉式（静态代码块）
class ticket {
    private int num ;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //1.构造器私有化 ，防止外部new创建
    private ticket() {
    }
    //2.本类内部创建对象实例
    private static ticket instance ;
    //在静态代码块中创建单例对象
    static{
        instance = new ticket();
    }
    //3.提供一个公有的静态方法，返回实例对象
    public static ticket getInstance() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
