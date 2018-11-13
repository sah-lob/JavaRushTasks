package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i< 10; i++){
            String s = reader.readLine();
            list.add(s);
        }
        int a = 0;
        for (int i=0; i<10; i++){
            if (i < 9 && a<1){
                if (list.get(i).length()>list.get(i+1).length()){
                    System.out.println(i+1);
                    a = 1;
                }

            }}
    }}

