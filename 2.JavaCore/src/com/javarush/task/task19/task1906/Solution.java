package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));


        FileReader reader = new FileReader(reader2.readLine());
        FileWriter writer = new FileWriter(reader2.readLine());

        reader2.close();
        int i = 0;
        while (reader.ready()){
            i++;
            int data = reader.read();
            if(i%2 == 0){
            writer.write(data);
            }
        }
        reader.close();
        writer.close();
    }
}
