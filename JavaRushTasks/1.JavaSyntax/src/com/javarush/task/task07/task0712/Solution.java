package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min =0, max = 0, n1 = 0, n2 = 0;
        ArrayList<String> al = new ArrayList();
        for (int i=0;i<10;i++){
            al.add(reader.readLine());
            if (i == 0){
            min = al.get(i).length();}
            if (min > al.get(i).length()){
               min = al.get(i).length();
               n1 = i;
            }
            if (max < al.get(i).length()){
                max = al.get(i).length();
                n2= i;
        }

    }
        if (n2<n1){
            System.out.println(al.get(n2));
        }
        else {
            System.out.println(al.get(n1));
        }
}}
