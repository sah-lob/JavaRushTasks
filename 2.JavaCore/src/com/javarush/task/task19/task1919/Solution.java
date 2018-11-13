package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {


//        BufferedReader file = new BufferedReader(new FileReader("/Users/alexanderlobachev/Программирование/fl.txt"));
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader file = new BufferedReader(fileReader);

        String str = "";


        while (file.ready()) {
            char symbol = (char) file.read();
            str = str + String.valueOf(symbol);
        }
        ArrayList<String[]> buk = new ArrayList<>();
        ArrayList<String[]> buk2 = new ArrayList<>();
        String[] people;
        int num = 0;
        double p = 0;
        int pop = 0;

        String[] mas = str.split("\\n");

        for (int i = 0; i < mas.length; i++) {
            people = (mas[i].split(" "));
            buk.add(people);
        }

        for (int i = 0; i < buk.size(); i++) {

        }

        for (int i = 0; i < buk.size(); i++) {
            for (int j = 0; j < buk2.size(); j++) {

                if (buk.get(i)[0].equals(buk2.get(j)[0])) {
                    num = num + 1;
                    p = Double.parseDouble(buk.get(i)[1]) + Double.parseDouble(buk2.get(j)[1]);
                    pop = j;
                }
            }

            if (num == 0) {
                buk2.add(buk.get(i));
            }

            if (num != 0) {
                buk2.get(pop)[1] = String.valueOf(p);
            }
            p = 0;
            num = 0;
        }

        ArrayList<String> ii = new ArrayList<>();
        ArrayList<String> ii2 = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Double> nb = new ArrayList<>();


        for (int i = 0; i<buk2.size();i++){
            nb.add(Double.parseDouble(buk2.get(i)[1]));
        }
        Collections.sort(nb);
        for(int i = 0; i < buk2.size(); i++){
            for(int j = 0; j< buk2.size();j++){
                if(Double.parseDouble(buk2.get(j)[1]) == nb.get(i)){
                    double we = Double.parseDouble(buk2.get(j)[1]);
                    ii.add(buk2.get(j)[0]+" "+ we);
            }
            }
        }



        for (int i = 0; i<buk2.size();i++){
            name.add(buk2.get(i)[0]);
        }

        Collections.sort(name);

        for(int i = 0; i < buk2.size(); i++){
            for(int j = 0; j< buk2.size();j++){
                if((buk2.get(j)[0]).equals(name.get(i))){
                    double we = Double.parseDouble(buk2.get(j)[1]);
                    ii2.add(buk2.get(j)[0]+" "+ we);
                }
            }
        }


//        for(int i = 0 ; i<ii.size();i++){
//            System.out.println(ii.get(i));
//
//        }
//
//        System.out.println("");
//        System.out.println("");

        for(int i = 0 ; i<ii2.size();i++){
            System.out.println(ii2.get(i));
        }

        file.close();

    }
}
