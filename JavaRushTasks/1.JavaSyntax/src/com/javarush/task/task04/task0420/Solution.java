package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));


        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        String saAge = reader.readLine();
        int b = Integer.parseInt(saAge);
        String ssAge = reader.readLine();
        int c = Integer.parseInt(ssAge);

        if (a==b & a==c){
            System.out.println(a + " " + b + " " + c );
        }
        else {
            if (a >= b & a >= c) {
                if (b >= c) {
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            }
            else {
                if (b >= a & b >= c) {
                    if (a <= c) {
                        System.out.println(b + " " + c + " " + a);
                    } else {
                        System.out.println(b + " " + a + " " + c);
                    }
                }
                else {
                    if (c >= b & c >= a) {
                        if (b >= a) {
                            System.out.println(c + " " + b + " " + a);
                        } else {
                            System.out.println(c + " " + a + " " + b);
                        } }
                }}
        }
    }
}
