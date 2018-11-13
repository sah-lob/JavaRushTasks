package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        String ssAge = reader.readLine();
        int b = Integer.parseInt(ssAge);

        if (a>0 & b>0) {System.out.println(1);}
        if (a<0 & b>0) {System.out.println(2);}
        if (a<0 & b<0) {System.out.println(3);}
        if (a>0 & b<0) {System.out.println(4);}


    }
}


