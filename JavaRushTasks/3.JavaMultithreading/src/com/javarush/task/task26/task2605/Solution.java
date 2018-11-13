package com.javarush.task.task26.task2605;

/*
Трудолюбие - душа всякого дела и залог благосостояния!!
*/
public class Solution {

    volatile static int i;


    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new T1("первый поток");
        Thread t2 = new T1("второй поток");

        t2.start();
        t1.start();

//        new T1().start();
    }

    static class T1 extends Thread{

        String name;

        public T1(String name) {
            this.name = name;
        }

        public void run() {
                while (i < 5000) {
                    System.out.println(name + "      " + i);
                    ++i;
                }
        }
    }
}
