package com.example.demo.Observer.general1;

public class GuanChaZherImpl2 extends GuanChazher{

    public GuanChaZherImpl2(ZhuCeZher zcz){
        this.zhuCeZher = zcz;
        this.zhuCeZher.attach(this);
    }

    @Override
    public void update() {
        //获取到父类状态
        Integer state = super.zhuCeZher.getState();
        System.out.println("观察者2 获取到状态："+state+"将进入："+(state==0?"贤者":"狂暴")+"模式");
    }
}
