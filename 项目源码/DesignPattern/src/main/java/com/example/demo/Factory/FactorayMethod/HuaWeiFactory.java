package com.example.demo.Factory.FactorayMethod;

import com.example.demo.Factory.Flush.HuaWeiPhoneFlush;

//华为的车间及流水线
public class HuaWeiFactory implements FactorayMethod{
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
}
