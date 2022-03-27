package com.example.demo.strategy;

public class DoubleEleCal implements ShoppingStore{
    @Override
    public void calculatePrice(String festival) {
        System.out.println(festival + ":打八折购买");
    }
}
