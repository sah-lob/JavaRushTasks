package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            String result = bf.readLine();
            while(!result.equals("exit")){
                try{
                    if(result.contains(".")) print(Double.valueOf(result));
                    else{
                        int number = Integer.parseInt(result);
                        if (number >= 128 || number <= 0) {
                            print(number);
                        } else {
                            print((short) number);
                        }
                    }
                }catch(NumberFormatException nfe){
                    print(result);
                }
                result = bf.readLine();
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

