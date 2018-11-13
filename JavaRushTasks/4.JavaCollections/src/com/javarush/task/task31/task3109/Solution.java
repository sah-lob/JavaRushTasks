package com.javarush.task.task31.task3109;

import java.io.*;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {

        File file = new File(fileName);
        Properties properties = new Properties();

        if(fileName.contains(".xml")){
            try {
                FileInputStream fis = new FileInputStream(fileName);
                try {
                    properties.loadFromXML(fis);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            try {
                properties.load(new FileReader(fileName));
            } catch (IOException e) {
                try {
                    properties.getOrDefault(new FileReader(fileName),"");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return properties;
    }
}
