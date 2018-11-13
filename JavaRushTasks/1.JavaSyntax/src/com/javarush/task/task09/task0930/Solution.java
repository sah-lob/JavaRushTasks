package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> words = new ArrayList<>(); //создаём два списка: для чисел и слов
        ArrayList<Integer> nums = new ArrayList<>();
        for (String str : array){ //проходимся по всему массиву
            if (isNumber(str)) //сортируем элементы по спискам
                nums.add(Integer.parseInt(str));
            else words.add(str);
        }
        for (int i = 0; i <words.size() ; i++) {
            for (int j = 0; j <words.size()-1; j++) {
                String var = words.get(j);
                if (isGreaterThan(words.get(j),words.get(j+1))){
                    words.set(j, words.get(j+1));
                    words.set(j+1, var);
                }
            }
        }
        for (int i = 0; i <nums.size() ; i++) {
            for (int j = 0; j <nums.size()-1; j++) {
                int var = nums.get(j);
                if (nums.get(j) < nums.get(j+1)){
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, var);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(isNumber(array[i])){
                array[i] = String.valueOf(nums.get(0));
                nums.remove(0);
            }else {
                array[i] = words.get(0);
                words.remove(0);
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
