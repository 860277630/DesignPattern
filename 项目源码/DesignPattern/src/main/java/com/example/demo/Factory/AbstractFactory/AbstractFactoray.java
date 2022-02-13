package com.example.demo.Factory.AbstractFactory;

//抽象工厂模式  需要多个接口  来供不同的工厂实现
public interface AbstractFactoray {


    Object createPhone(Class clazz);

    Object createComputer(Class clazz);

}
