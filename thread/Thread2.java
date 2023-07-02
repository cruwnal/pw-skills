package com.thread;

class thread3 extends Thread{
public void run(){
    System.out.println("child thread ");
}

}



public class Thread2 {

    public static void main(String[] args) {
        thread3 t3 = new thread3();
        t3.start();
    }


}
