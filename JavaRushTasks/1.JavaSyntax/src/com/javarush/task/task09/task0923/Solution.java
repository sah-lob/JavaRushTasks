package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine(), gl = "", sgl = "";
        char[] in = s.toCharArray();
        for(int i=0;i<in.length;i++) {
            if(in[i]==' ') {
                continue;
            }
            if(isVowel(in[i])==true) {
                gl=gl+in[i]+" ";
            }
            if(isVowel(in[i])==false){
                sgl=sgl+in[i]+" ";
            }

        }
        System.out.println(gl);
        System.out.println(sgl);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}