package com.example.demo.Factory.AbstractFactory;

import com.example.demo.Factory.Flush.HuaWeiPhoneFlush;
import com.example.demo.Factory.Flush.HuaweiComputerFlush;

//华为的车间及流水线
public class HuaWeiAbstractFactory implements AbstractFactoray {
    @Override
    public Object createPhone(Class clazz) {
        try {
            if(null!=clazz){
                HuaWeiPhoneFlush h = (HuaWeiPhoneFlush) clazz.newInstance();
                h.setModel();
                h.setPrice();
                return h;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object createComputer(Class clazz) {
        try {
            if(null!=clazz){
                HuaweiComputerFlush h = (HuaweiComputerFlush) clazz.newInstance();
                h.setPerson();
                h.setPrice();
                h.setScreenSize();
                return h;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
