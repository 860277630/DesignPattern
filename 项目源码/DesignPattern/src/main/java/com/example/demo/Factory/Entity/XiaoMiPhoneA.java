package com.example.demo.Factory.Entity;

import com.example.demo.Factory.Flush.XiaoMiPhoneFlush;

public class XiaoMiPhoneA implements XiaoMiPhoneFlush {
    //键盘材质
    private String keyboardMaterial;

    //型号名
    private String model;

    //价格
    private double price;


    @Override
    public void setKeyboardMaterial() {
        System.out.println("小米手机机型A外壳材料设定为PVC塑料");
        this.keyboardMaterial = "PVC塑料";
    }

    @Override
    public void setModel() {
        System.out.println("小米手机机型A的型号设定为N95");
        this.model = "N95";
    }

    @Override
    public void setPrice() {
        System.out.println("小米手机机型A的价格设定为8000");
        this.price = 8000;
    }

    @Override
    public String toString() {
        return "XiaoMiPhoneA{" +
                "keyboardMaterial='" + keyboardMaterial + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
