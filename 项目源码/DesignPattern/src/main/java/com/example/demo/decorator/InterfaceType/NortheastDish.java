package com.example.demo.decorator.InterfaceType;

import com.example.demo.decorator.DishUtil;

//东北菜  多油多盐偏甜
public class NortheastDish extends BaseCookImpl{
    public NortheastDish(BaseCook baseCook) {
        super(baseCook);
    }

    @Override
    public void cookDish(){
        System.out.println("**********************");
        System.out.println("东北菜做法");
        super.cookDish();
        DishUtil.addMoreOil();
        DishUtil.addMoreSalt();
        DishUtil.addMoreSugar();
        System.out.println("**********************");

    }

}
