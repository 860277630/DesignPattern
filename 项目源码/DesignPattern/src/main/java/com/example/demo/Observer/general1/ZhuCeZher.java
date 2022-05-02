package com.example.demo.Observer.general1;

import java.util.ArrayList;
import java.util.List;

public class ZhuCeZher {
    private List<GuanChazher> list = new ArrayList<>();
    private Integer state;

    public Integer getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        huanXingGuanChaZhe();
    }

    public void attach(GuanChazher guanChazher){
        list.add(guanChazher);
    }

    public void huanXingGuanChaZhe(){
        for (GuanChazher guanChazher : list) {
            guanChazher.update();
        }
    }


}
