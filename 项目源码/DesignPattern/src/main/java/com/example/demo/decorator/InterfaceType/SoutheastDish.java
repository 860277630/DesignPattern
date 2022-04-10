package com.example.demo.decorator.InterfaceType;

import com.example.demo.decorator.DishUtil;

//东南菜   少油少盐偏甜
public class SoutheastDish extends BaseCookImpl{
    public SoutheastDish(BaseCook baseCook) {
        super(baseCook);
    }


    @Override
    public void cookDish(){
        System.out.println("**********************");
        System.out.println("东南菜做法");
        super.cookDish();
        DishUtil.addLessOil();
        DishUtil.addLessSalt();
        DishUtil.addMoreSugar();
        System.out.println("**********************");
    }
}
