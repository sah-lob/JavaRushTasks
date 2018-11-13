package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String st1 = reader.readLine();
        String st2 = reader.readLine();

        FileInputStream first = new FileInputStream(st1);
        FileInputStream second = new FileInputStream(st2);
        FileOutputStream first1 = new FileOutputStream(st1);

        byte[]  ff  = new byte[first.available()];
        byte[]  ff2  = new byte[second.available()];

        first.read(ff);
        first.close();
        second.read(ff2);
        second.close();

        first1.write(ff2);
        first1.write(ff);
        first1.close();

    }
}
