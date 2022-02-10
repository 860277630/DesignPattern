package com.example.demo.Adapter.objectAdapter;

import com.example.demo.Adapter.classAdapter.Phone;
import com.example.demo.Adapter.classAdapter.VoltageAdapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("====类适配器====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
