package com.example.demo.Factory.Entity;

import com.example.demo.Factory.Flush.HuaWeiPhoneFlush;

//普通机型B
public class HuaWeiPhoneB implements HuaWeiPhoneFlush {

    private String model;

    private double price;


    @Override
    public void setModel() {
        System.out.println("华为手机机型B设置名字为M40");
        this.model = "M40";
    }

    @Override
    public void setPrice() {
        System.out.println("华为手机机型B设置价格为3000元");
        this.price = 3000;
    }

    @Override
    public String toString() {
        return "HuaWeiPhoneB{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
