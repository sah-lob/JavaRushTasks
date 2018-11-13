package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader path = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path.readLine())));

        ArrayList<Integer> list = new ArrayList<>();

        while (reader.ready()) {
            String s = reader.readLine();
            if (Integer.parseInt(s)%2==0) list.add(Integer.parseInt(s));
        }
        reader.close();
        Collections.sort(list);
        list.forEach(value -> System.out.println(value));
    }
}

//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader path = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path.readLine())));
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        while (reader.ready()) {
//            String s = reader.readLine();
//            if (Integer.parseInt(s)%2==0) list.add(Integer.parseInt(s));
//        }
//        reader.close();
//        Collections.sort(list);
//        list.forEach(value -> System.out.println(value));
//    }
//}