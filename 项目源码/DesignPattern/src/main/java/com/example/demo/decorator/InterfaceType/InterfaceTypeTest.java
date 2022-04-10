package com.example.demo.decorator.InterfaceType;

import com.example.demo.decorator.InterfaceType.method.DuckCook;
import com.example.demo.decorator.InterfaceType.method.NoodlesCook;

public class InterfaceTypeTest {

    public static void main(String[] args) {
        BaseCook duckCook = new DuckCook();
        BaseCook noodlesCook = new NoodlesCook();
        //不同区域的不同做法
        NortheastDish northeastDish = new NortheastDish(duckCook);
        NorthwestDish northwestDish = new NorthwestDish(duckCook);
        SoutheastDish southeastDish = new SoutheastDish(noodlesCook);
        SouthwestDish southwestDish = new SouthwestDish(noodlesCook);
        northeastDish.cookDish();
        northwestDish.cookDish();
        southeastDish.cookDish();
        southwestDish.cookDish();
    }
}
