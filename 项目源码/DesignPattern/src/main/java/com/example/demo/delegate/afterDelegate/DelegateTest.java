package com.example.demo.delegate.afterDelegate;

//由于沽泡写的委派模式  对新手不友好  所以自写一个
public class DelegateTest {
    public static void main(String[] args) {
        WaiterLeader leader = new WaiterLeader();
        leader.toDoThings("端茶倒水");
        leader.toDoThings("端饭上菜");
        leader.toDoThings("造火箭");
    }
}
