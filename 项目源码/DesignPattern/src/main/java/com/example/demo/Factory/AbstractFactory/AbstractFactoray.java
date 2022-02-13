package com.example.demo.Factory.AbstractFactory;

//抽象工厂模式  需要多个接口  来供不同的工厂实现
public interface AbstractFactoray {


    Object createPhone(Class clazz);

    //创建电脑的时候  需要外界临时提供  材料供应商的名字
    Object createComputer(Class clazz,String supplier);

}
