package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static boolean qwerty = true;
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new TestThread());
        Thread t2 = new Thread(new TestThread());
        t.start();
        t2.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
    qwerty = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (qwerty) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

















//package com.javarush.task.task16.task1619;
//
///*
//А без interrupt слабо?
//*/
//
//public class Solution {
//    static int inj;
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(new TestThread());
//        t.start();
//        Thread.sleep(3000);
//        ourInterruptMethod();
//    }
//
//    public static void ourInterruptMethod() {
//        inj = 34;
//    }
//
//    public static class TestThread implements Runnable {
//        public void run() {
//            while (inj!=34) {
//                try {
//                    System.out.println("he-he");
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                }
//            }
//        }
//    }
//}
