package com.example.demo.decorator.extendType.method;


import com.example.demo.decorator.extendType.BaseCook;

public class DuckCook extends BaseCook {
    @Override
    public void cookDish() {
        System.out.println("做一盘烤鸭");
    }
}
