package com.example.demo.Factory.Entity;

import com.example.demo.Factory.Flush.XiaoMiPhoneFlush;

public class XiaoMiPhoneB implements XiaoMiPhoneFlush {
    //键盘材质
    private String keyboardMaterial;

    //型号名
    private String model;

    //价格
    private double price;


    @Override
    public void setKeyboardMaterial() {
        System.out.println("小米手机机型B外壳材料设定为磨砂");
        this.keyboardMaterial = "磨砂";
    }

    @Override
    public void setModel() {
        System.out.println("小米手机机型B的型号设定为N97");
        this.model = "N97";
    }

    @Override
    public void setPrice() {
        System.out.println("小米手机机型B的价格设定为9000");
        this.price = 9000;
    }

    @Override
    public String toString() {
        return "XiaoMiPhoneB{" +
                "keyboardMaterial='" + keyboardMaterial + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
