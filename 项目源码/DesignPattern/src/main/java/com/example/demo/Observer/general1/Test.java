package com.example.demo.Observer.general1;

public class Test {

    public static void main(String[] args) {
        ZhuCeZher zher = new ZhuCeZher();
        new GuanChaZherImpl1(zher);
        new GuanChaZherImpl2(zher);

        System.out.println("将状态切换为0");
        zher.setState(0);

        System.out.println("将状态切换为1");
        zher.setState(1);

    }
}
