package com.javarush.task.task19.task1908;

/* 
Выделяем числа
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
        String qwe = "";
        while (file.ready()){
            char symbol = (char) file.read();
            str = str + String.valueOf(symbol).toLowerCase();
        }
        str = str.replaceAll("\\p{Punct}", " ");
        str = str.replaceAll("\n", " ");

        String[] mas = str.split(" ");

        int k = 0;

        for ( int i = 0; i<mas.length; i++){
            for(int j = 0 ; j<mas[i].length(); j++){

            String in = String.valueOf(mas[i].charAt(j));
            if(in.equals("1") || in.equals("2") || in.equals("3") || in.equals("4") || in.equals("5") || in.equals("6") || in.equals("7") || in.equals("8") || in.equals("9") ||    in.equals("0")){ k = k+1; }
            if(mas[i].length() == k){qwe = qwe + mas[i] +" "; }}
            k = 0;}

        write.write(qwe);
        file.close();
        write.close();
    }
}