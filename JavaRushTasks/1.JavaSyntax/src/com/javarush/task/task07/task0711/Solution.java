package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> mas = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++){
            mas.add(reader.readLine());
        }
        for (int i = 0; i<13; i++){
            String b = mas.get(4);
            mas.remove(4);
            mas.add(0,b);
        }
        for (int i=0;i<mas.size();i++){
            System.out.println(mas.get(i));
        }
    }
}


/*
ArrayList <String> cats = new ArrayList();
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
for (int i = 0; i < 5; i++) {
    cats.add(reader.readLine());
}
for (int i = 0; i < 13; i++) {
    String word = cats.get(4);
    cats.remove(4);
    cats.add(0,word);
}
for (int i = 0; i < cats.size() ; i++) {
    System.out.println(cats.get(i));


 */