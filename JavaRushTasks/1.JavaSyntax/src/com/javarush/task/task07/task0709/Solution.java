package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al = new ArrayList();
        int max = 0;
        BufferedReader vvod = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = vvod.readLine();
            al.add(s);
            if (max < al.get(i).length()) {
                max = al.get(i).length();
            }
        }

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).length() <= max) {
                max = al.get(i).length();
            }
        }

        for (int i=0; i<al.size(); i++) {
            if (max==al.get(i).length())
                System.out.println(al.get(i));
        }
    }
}

