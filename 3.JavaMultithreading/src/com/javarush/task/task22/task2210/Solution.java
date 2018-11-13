package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[] list = getTokens("level22.lesson13.task01", ".");
        for(int i = 0 ; i< list.length; i++){
        System.out.print(list[i]+ " ");}

    }
    public static String [] getTokens(String query, String delimiter) {

        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);

        String[] list = new String[tokenizer.countTokens()];

        int i = 0;
        
        while(tokenizer.hasMoreTokens()){
            list[i] = tokenizer.nextToken();
            i++;
        }

    return list;
}
}
