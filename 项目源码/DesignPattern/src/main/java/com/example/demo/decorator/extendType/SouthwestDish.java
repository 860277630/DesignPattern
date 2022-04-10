package com.example.demo.decorator.extendType;

import com.example.demo.decorator.DishUtil;

//西南菜   少油少盐多辣
public class SouthwestDish extends BaseCookImpl {
    public SouthwestDish(BaseCook baseCook) {
        super(baseCook);
    }

    @Override
    public void cookDish(){
        System.out.println("**********************");
        System.out.println("西南菜做法");
        super.cookDish();
        DishUtil.addLessOil();
        DishUtil.addLessSalt();
        DishUtil.addMorePepper();
        System.out.println("**********************");
    }

}
