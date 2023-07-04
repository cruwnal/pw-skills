package com.runnable;


class Car implements Runnable {

    @Override
    synchronized  public void run() {

        try{
            System.out.println(Thread.currentThread().getName()+" Has entered the parking lots");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Get into car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Started to drive the car ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" came back and park the car ");
            Thread.sleep(2000);

        }catch(Exception e){
            System.out.println(e.toString());

        }


    }
}



public class SynchronisedInJava {
    public static void main(String [] args){
        Car obj = new Car();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);
        t1.setName("son-1");
        t2.setName("son-2");
        t3.setName("son-3");


        t1.start();
        t2.start();
        t3.start();





    }
}
