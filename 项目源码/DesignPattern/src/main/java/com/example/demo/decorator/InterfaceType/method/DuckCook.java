package com.example.demo.decorator.InterfaceType.method;

import com.example.demo.decorator.InterfaceType.BaseCook;

public class DuckCook implements BaseCook {
    @Override
    public void cookDish() {
        System.out.println("做一盘烤鸭");
    }
}
