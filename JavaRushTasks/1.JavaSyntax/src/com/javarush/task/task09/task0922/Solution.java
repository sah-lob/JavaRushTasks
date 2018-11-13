package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String dateKeyboardInput = r.readLine();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyy", Locale.ENGLISH);
        SimpleDateFormat df2 = new SimpleDateFormat("MMM dd, yyy", Locale.ENGLISH);
        Date date1 = df.parse(dateKeyboardInput);
        String strOutput = df2.format(date1);
        System.out.println(strOutput.toUpperCase());

    }
}


//SimpleDateFormat



