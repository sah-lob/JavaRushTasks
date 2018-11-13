package com.javarush.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountDownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }


    public static class CountDownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }

    public static class CountUpRunnable implements Runnable {

        private int QWE = Solution.number - 4;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    QWE += 1;
                    if (QWE == 6) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + QWE;
        }
    }
}

















//package com.javarush.task.task16.task1626;
//
//public class Solution {
//    public static int number = 5;
//
//    public static void main(String[] args) {
//        new Thread(new CountDownRunnable(), "Уменьшаем").start();
//        new Thread(new CountUpRunnable(), "Увеличиваем").start();
//    }
//
//    public static class CountUpRunnable implements Runnable {
//        private int countIndexDown = 6-Solution.number;
//
//        public void run() {
//            try {
//                while (true) {
//                    System.out.println(toString());
//                    countIndexDown += 1;
//                    if (countIndexDown == 6) {
//                        Thread.sleep(500);
//                        return;}
//                    Thread.sleep(500);
//                }
//            } catch (InterruptedException e) {
//            }
//        }
//        public String toString() {
//            return Thread.currentThread().getName() + ": " + countIndexDown;
//        }
//    }
//
//
//    public static class CountDownRunnable implements Runnable {
//        private int countIndexDown = Solution.number;
//
//        public void run() {
//            try {
//                while (true) {
//                    System.out.println(toString());
//                    countIndexDown -= 1;
//                    if (countIndexDown == 0) return;
//                    Thread.sleep(500);
//                }
//            } catch (InterruptedException e) {
//            }
//        }
//
//        public String toString() {
//            return Thread.currentThread().getName() + ": " + countIndexDown;
//        }
//    }
//}
