package com.example.demo.Proxy.dynamicproxy.jdkproxy;

public class ZhaoLiu implements IPerson{
    @Override
    public void findLove() {
        System.out.println("赵六要求：有房有车学历高");
    }

    @Override
    public void buyInsure() {
        System.out.println("0.00元");
    }
}
