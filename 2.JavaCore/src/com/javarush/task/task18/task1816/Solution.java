package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException { //jkl;jkj
        FileInputStream fis = new FileInputStream(args[0]);
        int i = 0;
        while (fis.available() > 0) {
            char c = (char)fis.read();
            String s = Character.toString(c);
            if (s.matches("\\w")){
                i++;
            }
        }
        fis.close();
        System.out.println(i);
    }
}
