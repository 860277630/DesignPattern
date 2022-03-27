package com.example.demo.strategy;

public class CommonCal implements ShoppingStore{
    @Override
    public void calculatePrice(String festival) {
        System.out.println(festival+":价格正常处理");
    }
}
