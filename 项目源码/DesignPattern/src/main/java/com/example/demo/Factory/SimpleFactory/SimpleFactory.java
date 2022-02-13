package com.example.demo.Factory.SimpleFactory;

import com.example.demo.Factory.Flush.HuaWeiPhoneFlush;

//简单工厂模式  就是对于   相同创建逻辑的类 可以使用简单工厂模式  进行创建
public class SimpleFactory {

    public HuaWeiPhoneFlush createCommonPhone(Class clazz){
        try {
            if(null!=clazz){
                HuaWeiPhoneFlush huaWeiPhone = (HuaWeiPhoneFlush) clazz.newInstance();
                huaWeiPhone.setModel();
                huaWeiPhone.setPrice();
                return huaWeiPhone;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
