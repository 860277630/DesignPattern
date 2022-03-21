package com.example.demo.delegate.afterDelegate;

public class WaiterA implements Specialty{
    @Override
    public void toDoThings(String task) {
        System.out.println("我是服务生A,我只负责餐前工作，现在我给客人："+task);
    }
}
