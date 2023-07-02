package com.runnable;

import org.w3c.dom.ls.LSOutput;

class JoinAndIsAlive implements Runnable {


    @Override
    public void run() {
        try{
            for (int i = 0; i < 7; i++) {
                System.out.println("focus is important");
            }

        }catch(Exception e){

            System.out.println(e.toString());
        }
    }
}


 class LaunchMultis{

     public static void main(String[] args) {
         System.out.println("main thread started");

         JoinAndIsAlive obj = new JoinAndIsAlive();

         Thread t1 = new Thread(obj);

        try {
            t1.start();
            t1.join();
        }catch(Exception e){
            System.out.println(e.toString());
        }
         System.out.println("main thread work has been finished");
     }


}
