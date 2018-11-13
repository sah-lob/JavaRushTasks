package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Самая длинная строка
*/

    public class Solution {
        private static List<String> strings;

        public static void main(String[] args) throws Exception {
            strings = new ArrayList<String>();
            ArrayList <String> max = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for (int i=0; i<5; i++){
                strings.add(br.readLine());
            }
            strings.sort(null);
            for (int i=strings.size()-1; i>0; i--){
                if(strings.get(i).length() >= strings.get(i-1).length() && strings.get(i).length() == strings.get(strings.size()-1).length()){
                    max.add(strings.get(i));
                }

            }
            for (int i=0; i<max.size(); i++){
                System.out.println(max.get(i));
            }
        }
    }

/*

public class Solution {
    private static List<String> strings= new ArrayList<>();

    public static void main(String[] args) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max=0;
        for (int i=0; i<5; i++){
            strings.add(reader.readLine());
            if (strings.get(i).length() > max) {
                max=strings.get(i).length();
            }
        }
        for (int i=0; i<5; i++) {
            if ((strings.get(i)).length()==max){
                System.out.println(strings.get(i));
            }
        }
    }
} */
