package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<String> priceList = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = null;
        try {
            String fileName = reader.readLine(), currentLine;
            fileReader = new BufferedReader(new FileReader(fileName));
            while ((currentLine = fileReader.readLine()) != null) {
                priceList.add(currentLine);
            }
            if (args[0].equals("-с")) {
                addToFile(fileName, createProductName(args), args[args.length - 2], args[args.length - 1]);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                reader.close();
                if (fileReader != null) fileReader.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void addToFile(String fileName, String productName, String price, String quantity)  {
        BufferedWriter fileWriter = null;
        try {
            fileWriter = new BufferedWriter(new FileWriter(fileName, true));
            fileWriter.write('\n' + getNewLastID() + setLenght(productName, 30) + setLenght(price, 8) + setLenght(quantity, 4));
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) fileWriter.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String createProductName(String[] array) {
        String result = "";
        for (int i = 1; i < array.length - 2; i++) {
            result += array[i] + " ";
        }
        return result;
    }

    public static int getInt(String str) {
        try {
            while (str.charAt(0) == '﻿') str = str.substring(1);
            return Integer.parseInt(str.trim());
        } catch (NumberFormatException e1) {
            System.out.println(str + " wrong ID!");
            e1.printStackTrace();
            return 0;
        }
    }
    public static String getNewLastID() {
        String result;
        int maxID = 0;
        for (int i = 0; i < priceList.size(); i++) {
            if (maxID < getInt(priceList.get(i).substring(0, 8))) maxID = getInt(priceList.get(i).substring(0, 8));
        }
        result = maxID + 1 + "";
        return setLenght(result, 8);
    }

    public static String setLenght(String str, int lenght) {
        StringBuilder builder = new StringBuilder(str);
        builder.setLength(lenght);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '\u0000') builder.setCharAt(i, ' ');
        }
        return builder.toString();
    }
}
