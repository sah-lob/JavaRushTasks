package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try{
                while (countSeconds >= 0){
                 if(countSeconds == 0){
                     System.out.print("Марш!");
                     break;
                 }
                 System.out.print(countSeconds + "        ");
                 Thread.sleep(1000);
                 countSeconds--;

                }
            } catch (InterruptedException e) { System.out.print("Прервано!"); }
        }
    }
}



























//public class Solution {
//    public static volatile int countSeconds = 0;
//
//    public static void main(String[] args) throws InterruptedException {
//        RacingClock clock = new RacingClock();
//        Thread.sleep(3500);
//        clock.interrupt();
//    }
//
//    public static class RacingClock extends Thread {
//        public RacingClock() {
//            start();
//        }
//
//        public void run() {
//            try {
//                while (countSeconds >= 0) {
//                    if (countSeconds == 0) {
//                        System.out.print("Марш!"); break;
//                    } else
//                    System.out.print(countSeconds + " ");
//                    Thread.sleep(1000);
//                    countSeconds--;
//                }
//            } catch (InterruptedException e) { System.out.print("Прервано!"); }
//        }
//    }
//}