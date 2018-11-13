package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream pp = new FileInputStream("/Users/alexanderlobachev/Программирование/penis.rtf");
        ArrayList<Integer> pewn =new ArrayList<>();

        while (pp.available()>0){
            int data = pp.read();
            pewn.add(data);
            System.out.println(data);
        }

        pp.close();

        int max = -1;
        int indmax = -1;
        int max2 = -1;
        int indmax2 = -1;
        int n = 0;

        for(int i = 0; i<pewn.size();i++){
            for(int j = 0; j< pewn.size();j++) {
                if(pewn.get(i) == pewn.get(j)){
                    max = max+1;
                    indmax = i;
                }
            }
            if (max >= max2){
                max2 = max;
                indmax2 = indmax;
                n = n+1;
            }
            max = 0;
        }
        System.out.println(max2 + " привет " + pewn.get(indmax2)+" Попа "+ (n-max2));
    }
}
