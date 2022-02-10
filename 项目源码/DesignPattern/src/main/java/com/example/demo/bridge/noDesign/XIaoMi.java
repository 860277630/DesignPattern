package com.example.demo.bridge.noDesign;

public class XIaoMi extends UpRight{
    @Override
    public void open(){
        super.open();
        System.out.println("小米手机开机");
    }


    @Override
    public void close(){
        super.close();
        System.out.println("小米手机关机");
    }

    @Override
    public void call(){
        super.call();
        System.out.println("小米手机打电话");
    }
}
