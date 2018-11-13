package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

            String line = read.readLine();
            if (!line.contains("obj")) {
                for (String trig : line.substring(line.indexOf("?") + 1, line.lastIndexOf("=")).split("&")) {
                    if (trig.contains("=")) System.out.print(trig.substring(0, trig.indexOf("=")) + " ");
                    else System.out.print(trig + " ");
                }
            }
            else {
                for (String trig : line.substring(line.indexOf("?") + 1, line.lastIndexOf("=")).split("&")) {
                    if (trig.contains("=")) {System.out.print(trig.substring(0,trig.indexOf("="))+" ");continue;}
                    else {System.out.println(trig); continue;}
                }

                try {
                    alert(Double.parseDouble(line.substring(line.indexOf("=") + 1, line.lastIndexOf("&"))));
                }
                catch (Exception h){
                    alert(line.substring(line.indexOf("=") + 1, line.lastIndexOf("&")));
                }

            }
        }
        catch (Exception e){}
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
