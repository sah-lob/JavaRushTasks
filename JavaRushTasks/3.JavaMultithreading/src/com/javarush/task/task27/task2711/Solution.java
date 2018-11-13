//package com.javarush.task.task27.task2711;
//
//import com.javarush.task.task27.task2712.ConsoleHelper;
//
//import java.util.concurrent.CountDownLatch;
//
///*
//CountDownLatch
//*/
//public class Solution {
//
//    private volatile boolean isWaitingForValue = true;
//
//    CountDownLatch latch = new CountDownLatch(1);
//
//    public void someMethod() throws InterruptedException {
//        latch.await();
//        retrieveValue();
//        latch.countDown();
//    }
//
//    void retrieveValue() {
//        ConsoleHelper.writeMessage("Value retrieved.");
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
