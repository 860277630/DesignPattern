package com.example.demo.Proxy.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();
        zhangsan.buyInsure();


        byte[] $Proxies = ProxyGenerator.generateProxyClass("$Proxy", new Class[]{IPerson.class});
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D://$Proxy.class");
            fileOutputStream.write($Proxies);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
