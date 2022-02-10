package com.example.demo.bridge.bridgeDemo;

public class Oppo implements Brand{
    @Override
    public void open() {
        System.out.println("OPPO手机开机！！！");
    }

    @Override
    public void close() {
        System.out.println("OPPO手机关机！！");
    }

    @Override
    public void call() {
        System.out.println("OPPO手机打电话！！！");
    }
}
