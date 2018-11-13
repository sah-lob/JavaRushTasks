package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        int counter = 0;
        String l = "зелёный";
        while (counter < t){
            counter += 3;
            if (counter > t) break;
            l = "жёлтый";
            counter += 1;
            if (counter > t) break;
            l = "красный";
            counter += 1;
            if (counter > t) break;
            l = "зелёный";}
        System.out.println(l);
    }
}
