package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String n = reader.readLine();
        int n2 = Integer.parseInt(n);
        System.out.println("Я буду зарабатывать $" + n2 + " в час");
    }
}

