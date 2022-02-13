package com.example.demo.Factory.Entity;

import com.example.demo.Factory.Flush.XiaoMiComputerFlush;

//小米电脑
public class XiaoMiComputer implements XiaoMiComputerFlush {

    private String value;

    private String appearance;

    private String price;


    @Override
    public void setValue() {
        System.out.println("小米电脑设定性价比为很高");
        this.value = "很高";
    }

    @Override
    public void setAppearance() {
        System.out.println("小米电脑设置外观为黑白");
        this.appearance = "黑白";
    }

    @Override
    public void setPrice() {
        System.out.println("小米电脑设置价格为5000");
        this.price = "5000";
    }

    @Override
    public String toString() {
        return "XiaoMiComputer{" +
                "value='" + value + '\'' +
                ", appearance='" + appearance + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
