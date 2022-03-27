package com.example.demo.template;

public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("================非疫情期间进食====================");
        FeiYiQing yiQing = new FeiYiQing();
        yiQing.eatDinner();
        System.out.println("================疫情期间进食====================");
        YiQing qing = new YiQing();
        qing.eatDinner();
    }
}
