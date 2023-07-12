package com.runnable;

class Library implements Runnable {

    String res1 = new String("JAVA");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        if (name.equals("student1")) {
            synchronized (res1) {
                System.out.println("student 1 has acc " + res1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (res2) {
                    System.out.println("student 1 has acc  " + res2);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res3) {
                        System.out.println("student 1 has acc " + res3);
                    }
                }
            }
        } else {
            synchronized (res3) {
                System.out.println("student 2 has acc " + res3);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (res2) {
                    System.out.println("student 2 has acc  " + res2);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (res1) {
                        System.out.println("student 2 has acc " + res1);
                    }
                }
            }
        }
    }
}

public class DeadlockConcept2 {
    public static void main(String[] args) {
        Library lib = new Library();
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("student1");
        t2.setName("student2");
        t1.start();
        t2.start();
    }
}
