package com.example.demo.Observer.general;

public class generalTest {

    public static void main(String[] args) {
        GuanChaZher_1 guanChaZher_1 = new GuanChaZher_1();
        GuanChaZher_2 guanChaZher_2 = new GuanChaZher_2();
        ZhuCeZher zhuCeZher = new ZhuCeZher();
        zhuCeZher.attach(guanChaZher_1);
        zhuCeZher.attach(guanChaZher_2);
        zhuCeZher.updtaState();
    }
}
