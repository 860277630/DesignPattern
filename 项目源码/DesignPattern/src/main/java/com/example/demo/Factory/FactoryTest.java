package com.example.demo.Factory;



import com.example.demo.Factory.AbstractFactory.HuaWeiAbstractFactory;
import com.example.demo.Factory.AbstractFactory.XiaoMiAbstractFactory;
import com.example.demo.Factory.Entity.*;
import com.example.demo.Factory.FactorayMethod.HuaWeiFactory;
import com.example.demo.Factory.FactorayMethod.XiaoMiFactory;
import com.example.demo.Factory.Flush.HuaWeiPhoneFlush;
import com.example.demo.Factory.Flush.HuaweiComputerFlush;
import com.example.demo.Factory.Flush.XiaoMiComputerFlush;
import com.example.demo.Factory.Flush.XiaoMiPhoneFlush;
import com.example.demo.Factory.SimpleFactory.SimpleFactory;

public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("============简单工厂模式==================");
        SimpleFactory simpleFactory = new SimpleFactory();
        HuaWeiPhoneFlush huaWeiPhoneA = simpleFactory.createCommonPhone(HuaWeiPhoneA.class);
        HuaWeiPhoneFlush huaWeiPhoneB = simpleFactory.createCommonPhone(HuaWeiPhoneB.class);
        System.out.println(huaWeiPhoneA.toString());
        System.out.println(huaWeiPhoneB.toString());
        System.out.println("============工厂方法模式==================");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        HuaWeiPhoneFlush huaWeiPhone1 = (HuaWeiPhoneFlush)huaWeiFactory.createPhone(HuaWeiPhoneA.class);
        HuaWeiPhoneFlush huaWeiPhone2 = (HuaWeiPhoneFlush)huaWeiFactory.createPhone(HuaWeiPhoneB.class);
        XiaoMiPhoneFlush xiaoMiPhoneA = (XiaoMiPhoneFlush) xiaoMiFactory.createPhone(XiaoMiPhoneA.class);
        XiaoMiPhoneFlush xiaoMiPhoneB = (XiaoMiPhoneFlush) xiaoMiFactory.createPhone(XiaoMiPhoneB.class);
        System.out.println(huaWeiPhone1.toString());
        System.out.println(huaWeiPhone2.toString());
        System.out.println(xiaoMiPhoneA.toString());
        System.out.println(xiaoMiPhoneB.toString());
        System.out.println("============抽象工厂模式==================");
        HuaWeiAbstractFactory huaWeiAbstractFactory = new HuaWeiAbstractFactory();
        XiaoMiAbstractFactory xiaoMiAbstractFactory = new XiaoMiAbstractFactory();
        HuaWeiPhoneFlush huaWeiPhone = (HuaWeiPhoneFlush)huaWeiAbstractFactory.createPhone(HuaWeiPhoneA.class);
        HuaweiComputerFlush huaWeiComputer = (HuaweiComputerFlush) huaWeiAbstractFactory.createComputer(HuaWeiComputer.class);
        XiaoMiPhoneFlush xiaoMiPhone = (XiaoMiPhoneFlush)xiaoMiAbstractFactory.createPhone(XiaoMiPhoneA.class);
        XiaoMiComputerFlush xiaoMiComputer = (XiaoMiComputerFlush) xiaoMiAbstractFactory.createComputer(XiaoMiComputer.class);
        System.out.println(huaWeiPhone.toString());
        System.out.println(huaWeiComputer.toString());
        System.out.println(xiaoMiPhone.toString());
        System.out.println(xiaoMiComputer.toString());

    }
}
