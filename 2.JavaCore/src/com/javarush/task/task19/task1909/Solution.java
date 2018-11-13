package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader file = new BufferedReader(new FileReader(file1));
        BufferedWriter write = new BufferedWriter(new FileWriter(file2));

        String str = "";


        while (file.ready()){
            char symbol = (char) file.read();
            str = str + String.valueOf(symbol);
        }

        char[] mas = str.toCharArray();

        for(int i = 0; i<mas.length; i++){
            if(mas[i] == '.'){mas[i] = '!';}
        }

        write.write(mas);
        file.close();
        write.close();
    }
}