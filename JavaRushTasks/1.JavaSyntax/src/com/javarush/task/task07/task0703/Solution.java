package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String listWord[] = new String [10];
        int listNumber[] = new int [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < listWord.length;  i++)
        {
            listWord[i] = reader.readLine();
            listNumber[i] = listWord[i].length();
            System.out.println(listNumber[i]);

        }



    }
}