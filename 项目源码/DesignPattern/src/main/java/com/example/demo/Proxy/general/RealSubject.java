package com.example.demo.Proxy.general;

public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
