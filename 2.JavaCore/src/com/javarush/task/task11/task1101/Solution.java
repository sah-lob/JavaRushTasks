package com.javarush.task.task11.task1101;

/* 
Лошадь и Пегас
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Horse {
    int i = 23;
    }

    public class Pegas extends Horse {

        public void Pegas(){
        for(int j = 0; j<i; j++) {
             System.out.println(j);
            }
        }
    }
}
