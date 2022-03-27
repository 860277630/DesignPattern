package com.example.demo.template;

public abstract class EatDinner {

    public final void eatDinner(){
        //打开门
        openDoor();
        //判断是否需要健康码
        if(needHealthCode()){
            reportHealthCode();
        }
        //点菜吃饭
        orderAndDinner();
    }

    protected void openDoor(){
        System.out.println("我打开了饭店的门");
    }

    protected abstract void orderAndDinner();

    protected  void reportHealthCode(){
        System.out.println("我上报了健康码");
    };

    //钩子方法
    protected boolean needHealthCode(){return  false;}


}
