package com.javarush.task.task09.task0926;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   ArrayList<int[]> list = new ArrayList<>();
   int[] sizes = {5, 2, 4, 7, 0};
   for (int i = 0; i<sizes.length; i ++ ){
       int[] a = new int [sizes[i]];
       for (int j = 0; j<a.length; j++){
           a[j] = j;
       }
       list.add(a);
   }
   return list;
    }


    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
