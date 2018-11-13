package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        boolean[] fileData = new boolean[256];

        while(fileInputStream.available() > 0){
            fileData[fileInputStream.read()] = true;
        }

        fileInputStream.close();

        for (int i = 0; i < fileData.length; i++){
            if (fileData[i]) System.out.print(i + " ");
        }
    }
}
