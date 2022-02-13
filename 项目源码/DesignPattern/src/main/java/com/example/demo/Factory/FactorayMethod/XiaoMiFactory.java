package com.example.demo.Factory.FactorayMethod;

import com.example.demo.Factory.Flush.XiaoMiPhoneFlush;

//小米的车间及流水线
public class XiaoMiFactory implements FactorayMethod{
    @Override
    public Object createPhone(Class clazz) {
        try {
            if(null!=clazz){
                XiaoMiPhoneFlush x = (XiaoMiPhoneFlush) clazz.newInstance();
                x.setKeyboardMaterial();
                x.setModel();
                x.setPrice();
                return x;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
