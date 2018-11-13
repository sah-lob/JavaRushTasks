package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }
        String t = "";
        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
            t = t + s;
        }


        char[] penis = t.toCharArray();
        int n = 0;
        for (int i = 0; i < 33; i++){
            for (int j = 0; j < penis.length; j++)
                if (abcArray[i] == penis[j]){
                    n = n+1;
                }
            System.out.println(abcArray[i] + " "+ n);
                n = 0;
        }

    }}
