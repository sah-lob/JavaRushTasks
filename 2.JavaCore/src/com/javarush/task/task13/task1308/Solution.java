package com.javarush.task.task13.task1308;

/* 
Эй, ты там живой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Alex penis = new Alex();
        System.out.println(penis.isAlive());
    }

    public interface Person{
        public boolean isAlive();
    }
    public interface Presentable extends Person{
        boolean sss = false;
    }

    public static class Alex implements Presentable{

        @Override
        public boolean isAlive() {
            return sss;
        }
    }
}































//
///*
//Эй, ты там живой?
//*/
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//    }
//    public interface Person{
//        public boolean isAlive();
//    }
//    public interface Presentable extends Person{
//        public boolean isAlive();
//    }
//}