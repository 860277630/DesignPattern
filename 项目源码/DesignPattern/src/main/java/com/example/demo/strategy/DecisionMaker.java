package com.example.demo.strategy;

import java.util.HashMap;
import java.util.Map;

public class DecisionMaker implements ShoppingStore{
    //将各个节日及打折算法  进行注册
    private static Map<String,ShoppingStore>  methods= new HashMap<>();
    static {
        methods.put("正常",new CommonCal());
        methods.put("节日",new FestivalCal());
        methods.put("双十一",new DoubleEleCal());
    }
    @Override
    public void calculatePrice(String festival) {
        int price = 200;
        if (methods.containsKey(festival)){
            methods.get(festival).calculatePrice(festival);
        }
        return;
    }
}
