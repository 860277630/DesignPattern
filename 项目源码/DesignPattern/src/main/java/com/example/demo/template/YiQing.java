package com.example.demo.template;

public class YiQing extends EatDinner{

    //疫情  需要扫健康码  所以钩子方法需要重写
    @Override
    protected boolean needHealthCode() {
        return Boolean.TRUE;
    }

    @Override
    protected void orderAndDinner() {
        System.out.println("我点了一份番茄炒蛋，并且已经开吃");
    }
}
