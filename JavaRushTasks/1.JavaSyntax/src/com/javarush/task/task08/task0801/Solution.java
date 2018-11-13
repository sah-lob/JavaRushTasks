package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
       HashSet<String>  HashSet = new HashSet<>();
       String arr[] ={"арбуз" , "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
       for (int i=0; i<10; i++)
       {HashSet.add(arr[i]);
    }
    for (String x: HashSet){
           System.out.println(x);
    }
}}


