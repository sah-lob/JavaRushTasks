package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread thread = new TestThread();
        int i = 0;
        thread.start();
        Thread.sleep(20000);
        thread.interrupt();

    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        public void run(){
            int i = 0;
            try {
                    while (i < 2){
                        i = i+1;
                    Thread.sleep(1000);
                    System.out.println(i);
                    if (i == 1){
                        break;
                    }
                    }
                } catch (InterruptedException e) {
                   System.out.println("Зутшы");
                }
        }
    }
}

































//package com.javarush.task.task16.task1618;
//
///*
//Снова interrupt
//*/
//
//public class Solution {
//    public static void main(String[] args) throws InterruptedException {
//       TestThread test = new TestThread();
//       test.start();
//       test.interrupt();
//    }
//
//    //Add your code below - добавь код ниже
//    public static class TestThread extends Thread {
//        public void run(){
//
//        }
//    }
//}