package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> g = new ArrayList<>();
        ArrayList<Integer> gl3 = new ArrayList<>();
        ArrayList<Integer> gl2 = new ArrayList<>();
        ArrayList<Integer> gl = new ArrayList<>();

        for (int i=0;i<20;i++){
            int s = Integer.parseInt(reader.readLine());
            g.add(s);
        }

        for (int i=0; i<20;i++){
            if(g.get(i) %2==0 ||g.get(i) %3==0 ){
            if (g.get(i) % 3==0 ){
             gl3.add(g.get(i));
            }
            if (g.get(i) % 2==0 ){
                gl2.add(g.get(i));
            }}
            else gl.add(g.get(i));
        }

        printList(gl3);
        printList(gl2);
        printList(gl);
    }

    public static void printList(List<Integer> list) {
        for (int k=0;k<list.size();k++){
            System.out.println(list.get(k));
    }
}}