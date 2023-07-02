package com.thread;

import java.util.*;

class Clac extends Thread {
    public void run(){
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

class Message extends Thread{
    public void run(){


        System.out.println("displaying important message");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("focus is very important to master a skill  "+i);
                Thread.sleep(2000);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("second thread end\n******************************** ");
    }

}




public class ThreadMain1 {
    public static void main(String[] args) {
        System.out.println("main thread started ");
      Clac t1 = new Clac();
      Message t2 = new Message();

      t2.start();
        t1.start();
    }

}
