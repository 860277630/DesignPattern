package com.example.demo.single.enumSingleTon;

public class EnumSingleton {
    public static void main(String[] args) {
        EmumForSingleton e1 = EmumForSingleton.INSTANCE;
        EmumForSingleton e2 = EmumForSingleton.INSTANCE;
        System.out.println(e1 == e2);
    }
}
enum EmumForSingleton{
    INSTANCE;
}