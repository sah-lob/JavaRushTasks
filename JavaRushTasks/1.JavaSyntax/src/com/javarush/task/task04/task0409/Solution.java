package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
       int c , d;
       c = Solution.abs(10-a);
       d = Solution.abs(10-b);

       if (c <= d ) {System.out.println(a);}
       else {System.out.println(b);}


    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}

/*
                    int a1;
                    int b1;

                    a1 = Solution.abs(10 - a);
                    b1 = Solution.abs(10 - b);
                    if (a1<=b1){
                    if (a1==b1)
                    System.out.println(a);
                    else
                    System.out.println(a);}
                    else
                    System.out.println(b);  */