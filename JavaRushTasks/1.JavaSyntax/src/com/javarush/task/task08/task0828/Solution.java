package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Номер месяца
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        HashMap<String,Integer> map = new HashMap<>();

        Locale local = new Locale("us","US");
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM",local);
        Date date = new Date();

        for (int i = 0; i < 12 ; i++) {
            date.setMonth(i);
            map.put(sdf.format(date),i+1);
        }
        String m = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        System.out.println(m+" is "+map.get(m)+" month");
    }}



/*
public static boolean isDateOdd(String date) {
        Date inputTime = new Date(date);
        Date startTime = new Date("JAN 1 " + inputTime.getYear());
        long days = (inputTime.getTime() - startTime.getTime()) / 1000 / 60 / 60 / 24;
        return days % 2 == 0;
}
}
 */