package com.runnable;




class Example1 implements Runnable{
    public void run(){

        String name = Thread.currentThread().getName();
        System.out.println("just i want to check what daemon thread will do "+name);

    }
}

public class DaemonThread {
    public static void main(String [] args){
        boolean on = true;
        Example1 ex = new Example1();
        Thread t1 = new Thread(ex);
        Thread t2 = new Thread(ex);
        Thread t3 = new Thread(ex);

        t1.setDaemon(on);
        t2.setDaemon(on);
        t3.setDaemon(on);

        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");

        t1.start();
        t2.start();
        t3.start();

    }
}
