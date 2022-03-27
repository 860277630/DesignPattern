package com.example.demo.template;

public class FeiYiQing extends EatDinner{
    //非疫情期间不需要扫码  使用默认值即可

    @Override
    protected void orderAndDinner() {
        System.out.println("我点了一份烧烤，并且正在吃");
    }


}
