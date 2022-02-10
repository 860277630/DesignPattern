package com.example.demo.bridge.bridgeDemo;

public class XIaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机！！");
    }

    @Override
    public void close() {
        System.out.println("小米收集关机！！");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话！！");
    }
}
