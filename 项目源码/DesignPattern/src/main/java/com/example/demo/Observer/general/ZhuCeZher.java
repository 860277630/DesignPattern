package com.example.demo.Observer.general;

import java.util.ArrayList;
import java.util.List;

public class ZhuCeZher {

    private List<GuanChazher> list = new ArrayList<>();

    public void attach(GuanChazher guanChazher){
        list.add(guanChazher);
    }

    public void updtaState(){
        for (GuanChazher chazher : list) {
            chazher.update();
        }
    }
}
