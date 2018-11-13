package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min= 0;
        for (int i = 0; i<array.size();i++){
            if (i==0){min = array.get(i);}

            if (min > array.get(i)){
                min = array.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> pen = new ArrayList<>();
        int n;
        n = Integer.parseInt(reader.readLine());

        for (int i =0; i<n; i++){
            int s = Integer.parseInt(reader.readLine());
            pen.add(s);
        }
        return pen;
    }
}


/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список — метод getIntegerList.
3. Найти минимальное число среди элементов списка — метод getMinimum.
 */