package com.example.demo.Adapter.objectAdapter;

//适配器类
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = voltage220V.output220V();
        int destV = srcV/44;
        return destV;
    }
}
