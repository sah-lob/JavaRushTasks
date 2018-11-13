package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        String asAge = reader.readLine();
        int b = Integer.parseInt(asAge);
        String saAge = reader.readLine();
        int c = Integer.parseInt(saAge);


        if (a!=b & b!=c & c!=a){

        }
        else {
        if (a !=b & a !=c) {
            System.out.println("1");
        }
        if (b !=a & b!= c) {
            System.out.println("2");
        }
        if (c !=a & c !=b) {
            System.out.println("3");
        }}
    }
}
