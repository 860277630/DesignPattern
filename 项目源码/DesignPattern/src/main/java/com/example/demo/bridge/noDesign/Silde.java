package com.example.demo.bridge.noDesign;

public class Silde implements Phone{
    @Override
    public void open() {
        System.out.println("滑盖样式手机");
    }

    @Override
    public void call() {
        System.out.println("滑盖样式手机");
    }

    @Override
    public void close() {
        System.out.println("滑盖样式手机");
    }
}
