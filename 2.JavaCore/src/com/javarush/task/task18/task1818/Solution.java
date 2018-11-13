package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream qw = new FileOutputStream(reader.readLine());
        FileInputStream qw2 = new FileInputStream(reader.readLine());
        FileInputStream qw3 = new FileInputStream(reader.readLine());

        byte [] mas1 = new byte[qw2.available()];
        qw2.read(mas1);
        qw2.close();


        byte [] mas2 = new byte[qw3.available()];
        qw3.read(mas2);
        qw3.close();

        qw.write(mas1);
        qw.write(mas2);
        qw.close();
    }
}
