package com.example.demo.delegate.afterDelegate;

import javax.lang.model.element.VariableElement;
import java.util.HashMap;
import java.util.Map;

public class WaiterLeader implements Specialty{

    private Map<String,Specialty> waiters = new HashMap<>();
    private WaiterA waiterA = new WaiterA();
    private WaiterB waiterB = new WaiterB();

    //构造函数
    public WaiterLeader(){
        waiters.put("端茶倒水",waiterA);
        waiters.put("端饭上菜",waiterB);
    }

    @Override
    public void toDoThings(String task) {
        if(waiters.containsKey(task)){
            System.out.println("我是领班，我现在委派任务："+task);
            waiters.get(task).toDoThings(task);
            return;
        }
        System.out.println("我是领班，我不能委派："+task);
    }
}
