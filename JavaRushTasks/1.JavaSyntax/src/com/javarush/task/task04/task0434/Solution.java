package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int i = 1;
        int n=1;

        while (i<110) {
            while (n<110) {
                if (n<109) {
                System.out.print(n * i + "penis ");
                }
                else {System.out.println(n * i);}
                n++;
            }
            i++;
            n=1;
        }

    }
}
