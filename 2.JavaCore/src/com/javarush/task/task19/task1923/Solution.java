package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new FileReader("/Users/alexanderlobachev/Программирование/fl.txt"));
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fileReader);
//        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/alexanderlobachev/Программирование/fl2.txt"));
//        FileWriter writer = new FileWriter("/Users/alexanderlobachev/Программирование/fl2.txt");
//        BufferedWriter writer = new BufferedWriter(fileWriter);

        FileWriter writer = new FileWriter(args[1]);

        String str = "";

        while (reader.ready()){
            char ew = (char)reader.read();
            str = str+ew;
        }

        str = str.replace("\n", " ");
        ArrayList<String> vagina = new ArrayList<>();


        boolean erw = true;
        int k =0;

//        System.out.println(str);
        String [] penis = str.split(" ");


        for(int i =0; i<penis.length;i++){
            for(int j = 0; j<penis[i].length();j++)
            if(penis[i].charAt(j) == '0' || penis[i].charAt(j) == '1' || penis[i].charAt(j) == '2' || penis[i].charAt(j) == '3' || penis[i].charAt(j) == '4' || penis[i].charAt(j) == '7' || penis[i].charAt(j) == '5' || penis[i].charAt(j) == '6' ||penis[i].charAt(j) == '8' || penis[i].charAt(j) == '9' ){
                k ++;
            }
            if(k >= 1){vagina.add(penis[i]);}
            k = 0;
        }

        for(int i = 0 ; i < vagina.size();i++){
            writer.write(vagina.get(i)+ " ");
//            System.out.print(vagina.get(i)+ " ");
        }

        reader.close();
        writer.close();
    }
}
