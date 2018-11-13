package com.javarush.task.task16.task1604;

/* 
Вывод стек-трейса
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    private static class SpecialThread implements Runnable {

        @Override
        public void run () {
            List<StackTraceElement> stackTraceElementList =
                    new ArrayList<>(Arrays.asList(Thread.currentThread().getStackTrace()));
            stackTraceElementList.forEach(System.out::println);
        }
    }
}

































//package com.javarush.task.task16.task1604;
//
///*
//Вывод стек-трейса
//*/
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(new SpecialThread());
//        thread.start();
//
//        System.out.println("*****************");
//
//        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
//            System.out.println(element);
//        }
//
//    }
//    public static class SpecialThread implements Runnable{
//        public void run () {
//            List<StackTraceElement> stackTraceElementList =
//                    new ArrayList<>(Arrays.asList(Thread.currentThread().getStackTrace()));
//            stackTraceElementList.forEach(System.out::println);
//        }
//    }
//
//}
