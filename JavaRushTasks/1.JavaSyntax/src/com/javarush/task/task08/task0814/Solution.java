package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> penis = new HashSet<>();
        for(int i = 0; i< 20; i++){
            penis.add(i);
        }
return penis;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> sort = new HashSet<>();
        for(Integer i: set){
            if(i<=10)
                sort.add(i);
        }
        return sort;

    }

    public static void main(String[] args) {

    }
}
