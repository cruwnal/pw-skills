package com.runnable;

/*Deadlock in Java is a part of multithreading. Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread. Since, both threads are waiting for each other to release the lock, the condition is called deadlock.*/
class A  {

   final int a = 12;
  synchronized   public void d1(B b){
      try {
          for (int i = 0; i < 10; i++) {
              System.out.println("here i am printing b " + b);
              Thread.sleep(5000);
          }
      }catch(Exception e){
          System.out.println(e.getMessage());
      }

    }

}

class B {
 final   int b = 23;

 synchronized    public void d2(A a) {
     try {
         for (int i = 0; i < 10; i++) {
             System.out.println("here i am printing a " + a);
             Thread.sleep(5000);
         }

     }
     catch(Exception e){

         String message = e.getMessage();
         System.out.println(message);

     }

 }
}


class RunningThread implements  Runnable {


    @Override
  synchronized   public void run() {
        A a1 = new A();
        B b1 = new B();
        a1.d1(b1);
        b1.d2(a1);

    }
}



public class DeadLockConcept {
    public static void main(String[] args) {
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
//        RunningThread rth = new RunningThread();
// Thread t1 = new Thread(rth);

// t1.start();



        Thread t1 = new Thread(){
            @Override
            public void run() {

                    synchronized (resource1) {
                        System.out.println("Thread 1: locked resource 1");

                        try { Thread.sleep(100);} catch (Exception e) {}

                        synchronized (resource2) {
                            System.out.println("Thread 1: locked resource 2");
                        }
                    }
                }

        };



        Thread t2 = new Thread(){

            public void run(){

                synchronized (resource2){
                    System.out.println("Thread 2:locked ");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){}
                }

                synchronized (resource1){
                    System.out.println("thread 2:locked resource 1");
                }
            }
        };

 t1.start();
 t2.start();

    }

}
