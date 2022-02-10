package com.example.demo.bridge.noDesign;

public class Oppo extends Folded{

    @Override
    public void open(){
        super.open();
        System.out.println("Oppo手机开机");
    }

    @Override
    public void close(){
        super.close();
        System.out.println("OPPO手机关机");
    }

    @Override
    public void call(){
        super.call();
        System.out.println("OPPO手机打电话");
    }
}
