package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

     String sAge = reader.readLine();
     int age = Integer.parseInt(sAge);
     String name = reader.readLine();

     System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
   }
    }




/*
 int nMoney = Integer.parseInt(sMoney);
План по захвату мира.
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + s + " лет. Му-ха-ха!");*/