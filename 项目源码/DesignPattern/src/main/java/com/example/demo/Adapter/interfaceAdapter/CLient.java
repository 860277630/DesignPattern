package com.example.demo.Adapter.interfaceAdapter;

public class CLient {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            //只需要关心我们需要的接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1方法！！");
            }
        };
        adapter.m1();
    }
}
