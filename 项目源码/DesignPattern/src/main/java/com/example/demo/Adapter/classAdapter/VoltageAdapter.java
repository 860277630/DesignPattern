package com.example.demo.Adapter.classAdapter;

//适配器类
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        int destV = srcV/44;
        return destV;
    }
}
