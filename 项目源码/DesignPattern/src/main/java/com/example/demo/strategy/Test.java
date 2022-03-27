package com.example.demo.strategy;

public class Test {
    public static void main(String[] args) {
        DecisionMaker decisionMaker = new DecisionMaker();
        decisionMaker.calculatePrice("正常");
        decisionMaker.calculatePrice("节日");
        decisionMaker.calculatePrice("双十一");
    }
}
