package com.example.demo.single.Ioc;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IocTest {

    //普通调用
    @Test
    public void test_1(){
        User user1 = (User)IocSingleton.getInstance("com.example.demo.single.Ioc.User");
        User user2 = (User)IocSingleton.getInstance("com.example.demo.single.Ioc.User");
        System.out.println(user1 == user2);
    }
    //反射破坏
    @Test
    public void test_2(){
        //下面演示反射破坏静态内部类
        try {
            Class<?> clazz = IocSingleton.class;
            //构造函数私有化  但是还是被反射获取到了
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            //然后拿到构造函数  就可以利用构造函数创建任意多个对象
            Object instance1 = c.newInstance();
            Object instance2 = c.newInstance();
            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance1 == instance2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //序列化破坏
    @Test
    public void test_3() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(IocSingleton.getInstance("com.example.demo.single.Ioc.User"));
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        User user1 = (User) ois.readObject();
        //因为序列化是通过反射创建的  在没有创建readResolve方法时  是通过newInstance创建的  所以可以测试下序列化  的new Instance创建
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("tempFile1"));
        oos1.writeObject(IocSingleton.getInstance("com.example.demo.single.Ioc.User"));
        File file1 = new File("tempFile1");
        ObjectInputStream ois1 =  new ObjectInputStream(new FileInputStream(file1));
        User user2 = (User) ois1.readObject();
        System.out.println(user1 == user2);
    }
}

//视频中并没有介绍  解决线程安全  和序列化  反射的办法
class IocSingleton implements Serializable{
    //构造函数私有化
    private IocSingleton(){
        //防反射破坏
        if(ioc!=null){
            throw new RuntimeException("禁止非法访问!!!");
        }
    }
    //模拟枚举单例  制作存储容器
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static synchronized Object getInstance(String className){
        Object instance = null;
        if(!ioc.containsKey(className)){
            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className,instance);
            }catch (Exception e){
                e.printStackTrace();
            }
            return instance;
        }else{
            return ioc.get(className);
        }
    }
}
class User implements Serializable {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //防止序列化
    private Object readResolve(){
        return IocSingleton.getInstance("com.example.demo.single.Ioc.User");
    }

}
