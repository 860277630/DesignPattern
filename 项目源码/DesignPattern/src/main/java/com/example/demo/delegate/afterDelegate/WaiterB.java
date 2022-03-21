package com.example.demo.delegate.afterDelegate;

public class WaiterB implements Specialty{
    @Override
    public void toDoThings(String task) {
        System.out.println("我是服务生B,我只负责餐中工作，现在我给客人："+task);
    }
}
