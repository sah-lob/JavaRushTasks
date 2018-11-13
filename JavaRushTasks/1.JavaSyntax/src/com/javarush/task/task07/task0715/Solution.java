package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> java = new ArrayList<>();
        java.add("мама");
        java.add("мыла");
        java.add("раму");

        for (int i=1; i<java.size()+1;i++){
            if (i%2!=0){
                java.add(i,"именно");
            }}
        for (int i =0; i<java.size();i++){
            System.out.println(java.get(i));
        }
    }
}
