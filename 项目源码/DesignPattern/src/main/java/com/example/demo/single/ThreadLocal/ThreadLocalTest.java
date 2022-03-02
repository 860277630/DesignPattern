package com.example.demo.single.ThreadLocal;

public class ThreadLocalTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSington.getInstance());
        System.out.println(ThreadLocalSington.getInstance());
        System.out.println(ThreadLocalSington.getInstance());
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
class ThreadLocalSington{
    private static final ThreadLocal<ThreadLocalSington> threadLocalInstance =
            new ThreadLocal<ThreadLocalSington>(){
                @Override
                protected ThreadLocalSington initialValue(){
                    return new ThreadLocalSington();
                }
            };
    private  ThreadLocalSington(){}

    public static ThreadLocalSington getInstance(){
        return threadLocalInstance.get();
    }
}
class ExectorThread implements Runnable{
    @Override
    public void run() {
        ThreadLocalSington instance = ThreadLocalSington.getInstance();
        System.out.println(ThreadLocalSington.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
