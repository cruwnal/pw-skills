package com.runnable;


class Example implements Runnable  {


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {

                System.out.println(i + " focus is important");
                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println("thread is interrupted ");
            }
        }


    }
}


public class IntruptMethod  {

    public static void main(String[] args) {
        Example obj = new Example();
        // new state
        Thread t1 = new Thread(obj);

        //

        t1.start();
        t1.interrupt();


    }
}


