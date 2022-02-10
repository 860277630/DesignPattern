package com.example.demo.bridge.noDesign;

public class Folded implements Phone{
    @Override
    public void open() {
        System.out.println("折叠样式手机");
    }

    @Override
    public void call() {
        System.out.println("折叠样式手机");
    }

    @Override
    public void close() {
        System.out.println("折叠样式手机");
    }
}
