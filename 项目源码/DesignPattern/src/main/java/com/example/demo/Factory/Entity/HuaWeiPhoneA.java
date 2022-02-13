package com.example.demo.Factory.Entity;

import com.example.demo.Factory.Flush.HuaWeiPhoneFlush;

//普通机型A
public class HuaWeiPhoneA implements HuaWeiPhoneFlush {

    private String model;

    private double price;


    @Override
    public void setModel() {
        System.out.println("华为手机机型A设置名字为P40");
        this.model = "P40";
    }

    @Override
    public void setPrice() {
        System.out.println("华为手机机型A设置价格为5000元");
        this.price = 5000;
    }

    @Override
    public String toString() {
        return "HuaWeiPhoneA{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
