package com.javarush.task.task18.task1824;

/*
Файлы и исключения
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)throws IOException{
        String s = "";
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
            while(true)new FileInputStream(s=reader.readLine()).close();
        }catch(FileNotFoundException e){
            System.out.println(s);
        }
    }
}
