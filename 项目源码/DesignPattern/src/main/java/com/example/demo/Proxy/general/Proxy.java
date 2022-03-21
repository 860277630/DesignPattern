package com.example.demo.Proxy.general;


public class Proxy implements ISubject{

    private ISubject subject;

    public Proxy(ISubject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    public void before(){
        System.out.println("called before requst().");
    }

    public void after(){
        System.out.println("called after request().");
    }
}
