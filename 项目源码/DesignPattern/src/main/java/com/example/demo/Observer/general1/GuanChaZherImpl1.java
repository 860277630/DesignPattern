package com.example.demo.Observer.general1;

public class GuanChaZherImpl1 extends GuanChazher{

    public GuanChaZherImpl1(ZhuCeZher zcz){
        this.zhuCeZher = zcz;
        this.zhuCeZher.attach(this);
    }

    @Override
    public void update() {
        //父类的属性
        Integer state = super.zhuCeZher.getState();
        System.out.println("观察者1 获取到状态："+state+"将进入："+(state==0?"狂暴":"贤者")+"模式");
    }
}
