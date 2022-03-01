package com.example.demo.single.enumSingleTon;


import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;

public class EnumSingleton {

    public static void main(String[] args) {
        //普通的创建方式
        EmumForSingleton e1 = EmumForSingleton.INSTANCE;
        EmumForSingleton e2 = EmumForSingleton.INSTANCE;
        System.out.println(e1.getU() == e2.getU());
        //value of 的创建方式
        EmumForSingleton instance = EmumForSingleton.valueOf("INSTANCE");
        System.out.println(instance.toString());
        EmumForSingleton instance2 = EmumForSingleton.valueOf("INSTANCE2");
        System.out.println(instance2.toString());
    }

    //用于测试反射破坏单例
    @Test
    public void testReflect(){

        try {
            Class clazz = EmumForSingleton.class;

            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
//            System.out.println(c);
            Object o = c.newInstance();
//            System.out.println(o);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //用于测试序列化破坏单例
    @Test
    public void testSerialization() throws Exception {
        System.out.println("===序列化破坏===");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(EmumForSingleton.INSTANCE);
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        EmumForSingleton newInstance = (EmumForSingleton) ois.readObject();
        System.out.println(newInstance == EmumForSingleton.INSTANCE);
    }

}
enum EmumForSingleton{

    INSTANCE;
    private User u = new User("peter",15,"man");
    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }
}

class User{
    private String name;
    private Integer age;
    private String sex;
    public User(String name,Integer age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}