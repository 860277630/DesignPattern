package com.example.demo.bridge.bridgeDemo;

public class Client {

    public static void main(String[] args) {
        System.out.println("========   start  =============");

        FoldedPhone foldedPhone = new FoldedPhone(new XIaoMi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();
    }
}
