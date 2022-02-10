package com.example.demo.bridge.noDesign;

public class Client {
    public static void main(String[] args) {
        Oppo oppo = new Oppo();
        XIaoMi xIaoMi = new XIaoMi();
        oppo.open();
        oppo.call();
        oppo.close();
        System.out.println("=========");
        xIaoMi.open();
        xIaoMi.call();
        xIaoMi.close();

    }
}
