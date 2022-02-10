package com.example.demo.bridge.noDesign;

public class UpRight implements Phone{
    @Override
    public void open() {
        System.out.println("直板样式手机");
    }

    @Override
    public void call() {
        System.out.println("直板样式手机");
    }

    @Override
    public void close() {
        System.out.println("直板样式手机");
    }
}
