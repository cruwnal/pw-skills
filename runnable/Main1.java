package com.runnable;
import java.util.*;
class Clac implements Runnable{

    @Override
    public void run() {
        System.out.println("calculation task started");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1= in.nextInt();
        System.out.println("enter the second number ");
        int num2 = in.nextInt();

        int res = num1+num2;
        System.out.println(res);
        System.out.println("calculation task is over \n ********************************************");

    }
}

class Message implements Runnable {
    @Override
    public void run() {
        System.out.println("displaying important message");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("focus is very important to master a skill  " + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("second thread end\n******************************** ");

}

}


public class Main1 {
    public static void main(String[] args) {
        System.out.println("main thread started ");

        Clac c1 = new Clac();
        Message m1 = new Message();

        Thread t1= new Thread(c1);
        Thread t2 = new Thread(m1);

        t1.start();
        t2.start();


    }
}
