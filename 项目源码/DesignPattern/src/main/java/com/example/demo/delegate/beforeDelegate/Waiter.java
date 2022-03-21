package com.example.demo.delegate.beforeDelegate;

import com.example.demo.delegate.beforeDelegate.Specialty;

//服务生
public class Waiter implements Specialty {
    @Override
    public void toDoThings(String task) {
        if(task.equals("端茶倒水")){
            System.out.println("只有我一个服务生，我现在需要给客人"+task);
        }else if(task.equals("端饭上菜")){
            System.out.println("只有我一个服务生，我现在需要给客人"+task);
        }else {
            System.out.println("这些工作超过了我的能力范围："+task);
        }
    }
}
