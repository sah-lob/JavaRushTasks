package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] penis = s.toCharArray();
        System.out.println(penis);
        for(int i=0;i<39;i++)
            System.out.println(s=s.replaceAll("^.",""));

    }

}

