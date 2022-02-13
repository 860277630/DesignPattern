package com.example.demo.Factory.AbstractFactory;

import com.example.demo.Factory.Flush.XiaoMiPhoneFlush;
import com.example.demo.Factory.Flush.XiaoMiComputerFlush;

//华为的车间及流水线
public class XiaoMiAbstractFactory implements AbstractFactoray {
    @Override
    public Object createPhone(Class clazz) {
        try {
            if(null!=clazz){
                XiaoMiPhoneFlush h = (XiaoMiPhoneFlush) clazz.newInstance();
                h.setPrice();
                h.setModel();
                h.setKeyboardMaterial();
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
                XiaoMiComputerFlush h = (XiaoMiComputerFlush) clazz.newInstance();
                h.setAppearance();
                h.setPrice();
                h.setValue();
                return h;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
