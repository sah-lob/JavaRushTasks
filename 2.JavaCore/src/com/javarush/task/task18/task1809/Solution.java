package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream r1 = new FileInputStream(scanner.next());
        FileOutputStream r2 = new FileOutputStream(scanner.next());
        ArrayList<String> re = new ArrayList<>();

        byte[] array = new byte[347];
        r1.read(array);

        for (int i = array.length-1; i >=0 ; i--) {
            r2.write(array[i]);
        }

        r1.close();
        r2 .close();
    }
}
