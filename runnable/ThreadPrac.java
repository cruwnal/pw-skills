package com.runnable;
import java.io.*;
import java.util.*;

 class MyThread implements Runnable{


     @Override
     public void run() {

         String tname = Thread.currentThread().getName();

         if(tname.equals("kunal")){
            impMessage();
         }else{

                 calclulation();

         }

     }

     public void impMessage(){
         System.out.println("imp message started **************");

         try{
         for (int i = 0; i < 10; i++) {

             System.out.println("important message "+i);
             Thread.sleep(2000);
         }
         }catch (Exception e){

         }
         finally {
             System.out.println("important message ends \n*********************");
         }

     }

     public void calclulation()  {

         Scanner in = new Scanner(System.in);
try {
    System.out.println("enter the  number: ");
    int num = in.nextInt();

    System.out.println("enter the size of table ");
    int size = in.nextInt();

    for (int i = 1; i <= size; i++) {
        System.out.println(num + " x " + i + " = " + num * i);
       Thread.sleep(2000);

    }


}catch(Exception e){
    System.out.println(e.getMessage());
}
     }

 }




 class ThreadPrac {
    public static void main(String[] args) {

        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        t1.setName("kunal");
        t2.setName("kuldeep");
        t1.start();
        t2.start();



    }
}
