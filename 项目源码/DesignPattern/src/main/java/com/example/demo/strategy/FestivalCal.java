package com.example.demo.strategy;

public class FestivalCal implements ShoppingStore{
    @Override
    public void calculatePrice(String festival) {
        System.out.println(festival + ":可以使用优惠券购买");
    }
}
