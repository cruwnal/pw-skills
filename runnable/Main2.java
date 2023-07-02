package com.runnable;


import java.util.Scanner;

class Clac1 extends Thread{

    @Override
    public void run() {
     String tname=  Thread.currentThread().getName();
     if(tname.equals("kunal")){
         calc();
     }else{
         metho2();
     }

    }

    public void metho2(){

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

    public void calc(){
        System.out.println("important calculation");
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

public class Main2

{
public static void main(String[]args){
    Clac1 thread1 = new Clac1();
    Clac1 thread2 = new Clac1();

    thread1.setName("kunal");
    thread2.setName("kuldeep");

    thread1.start();
    thread2.start();



}

}
