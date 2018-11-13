package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String we1 = reader.readLine();
        String we2 = reader.readLine();

        BufferedReader inFile = new BufferedReader(new FileReader(we1));
        BufferedWriter outFile = new BufferedWriter(new FileWriter(we2));

        String fileContains = "";

        while (inFile.ready()){
            fileContains += (char) inFile.read();
        }

        fileContains = fileContains.replaceAll("\\p{Punct}", "").replaceAll("\n", "");
        //System.out.println(fileContains);

        outFile.write(fileContains);

        reader.close();
        inFile.close();
        outFile.close();
    }
}