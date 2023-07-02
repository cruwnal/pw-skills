package com.thread;

public class Thread1 {

    public static void main(String[] args) {
        System.out.println("Main thread");

        String name =Thread.currentThread().getName();
//        String other = Thread.currentThread().getPriority();
        System.out.println(name+" , priority "+Thread.currentThread().getPriority());
        System.out.println("After changing the priority ");

        Thread t =Thread.currentThread();
        t.setName("Kunal");
        String name1 =Thread.currentThread().getName();

        t.setPriority(1);
        System.out.println(name1+" , priority "+Thread.currentThread().getPriority());


    }
}