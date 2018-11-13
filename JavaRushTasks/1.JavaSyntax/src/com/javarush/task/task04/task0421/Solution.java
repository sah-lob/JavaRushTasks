package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String sAge = reader.readLine();
        //int age = Integer.parseInt(sAge);

        String s = new String(reader.readLine());
        String s2 = new String(reader.readLine());

        int len1 = s.length();
        int len2 = s2.length();


        if (s.equals(s2)){
            System.out.println("Имена идентичны");
        }
        else {
            if (len1==len2) {
                System.out.println("Длины имен равны");
            }}
    }
}

//    int len1 = s1.length();