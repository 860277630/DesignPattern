package com.example.demo.Factory.Entity;

import com.example.demo.Factory.Flush.HuaweiComputerFlush;

public class HuaWeiComputer implements HuaweiComputerFlush {
    private String person;

    private String screenSize;

    private String price;

    @Override
    public void setPerson() {
        System.out.println("华为电脑针对打游戏人群的电脑");
        this.person = "打游戏人群";
    }

    @Override
    public void setScreenSize() {
        System.out.println("华为电脑屏幕为7寸");
        this.screenSize = "7寸";
    }

    @Override
    public void setPrice() {
        System.out.println("设定价格为90000");
        this.price  = "90000";
    }

    @Override
    public String toString() {
        return "HuaWeiComputer{" +
                "person='" + person + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
