package com.example.demo.delegate.beforeDelegate;


//由于沽泡写的委派模式  对新手不友好  所以自写一个
public class DelegateTest {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.toDoThings("端茶倒水");
        waiter.toDoThings("端饭上菜");
        waiter.toDoThings("造火箭");
    }

}
