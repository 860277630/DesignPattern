package com.example.demo.Adapter.objectAdapter;

public class Phone {
    //充电
    public void charging(Voltage5V voltage5V){
        if(voltage5V.output5V()==5){
            System.out.println("电压为5V，可以充电");
        }else{
            System.out.println("电压不匹配，不能充电");
        }
    }
}
