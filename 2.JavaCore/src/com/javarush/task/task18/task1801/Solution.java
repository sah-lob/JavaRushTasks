package com.javarush.task.task18.task1801;

import java.io.FileInputStream;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int max = -20000;
        String str;
        FileInputStream penis = new FileInputStream("/Users/alexanderlobachev/Программирование/fl.txt");

        while (penis.available() > 0) //пока есть еще непрочитанные байты
        {
          int data = penis.read();

          if(max<data){
              max = data;
          }
        }

        penis.close();

        System.out.println(max);
    }
}
