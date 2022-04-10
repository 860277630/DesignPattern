package com.example.demo.decorator.InterfaceType;

import com.example.demo.decorator.DishUtil;

//西北菜  少油多盐偏咸
public class NorthwestDish extends BaseCookImpl{
    public NorthwestDish(BaseCook baseCook) {
        super(baseCook);
    }

    @Override
    public void cookDish(){
        System.out.println("**********************");
        System.out.println("西北菜做法");
        super.cookDish();
        DishUtil.addLessOil();
        DishUtil.addMoreSalt();
        System.out.println("**********************");

    }


}
