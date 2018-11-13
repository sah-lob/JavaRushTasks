package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        String ssAge = reader.readLine();
        int b = Integer.parseInt(ssAge);
        String sssAge = reader.readLine();
        int c = Integer.parseInt(sssAge);


        int i = 0;
        if (a > 0)
        {i = i+1;}
        if (b > 0)
        {i = i+1;}
        if (c > 0)
        {i = i+1;}

        System.out.println(i);
    }
}
