package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] mmr= {"Мама","Мыла","Раму"};
        for (int i = 0; i<=2; i++) {
            for (int j = 0; j<=2;j++) {
                for (int k = 0; k<=2; k++){
                    if ((mmr[i] != mmr[j]) && (mmr[i] != mmr[k]) && (mmr[j] != mmr[k])){
                        System.out.println(mmr[i] + mmr[j]+ mmr[k]);
                    }

                }
            }
        }  //напишите тут ваш код
    }
}




