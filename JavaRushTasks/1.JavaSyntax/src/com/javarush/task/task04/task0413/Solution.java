package com.javarush.task.task04.task0413;

/*
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String d = reader.readLine();
        int de = Integer.parseInt(d);
        if (de > 7 || de < 1) {
            System.out.println("такого дня недели не существует"); }
        if (de == 1) {System.out.println("понедельник");}
        if (de == 2) {System.out.println("вторник");}
        if (de == 3) {System.out.println("среда");}
        if (de == 4) {System.out.println("четверг");}
        if (de == 5) {System.out.println("пятница");}
        if (de == 6) {System.out.println("суббота");}
        if (de == 7) {System.out.println("воскресенье");}
    }
}



