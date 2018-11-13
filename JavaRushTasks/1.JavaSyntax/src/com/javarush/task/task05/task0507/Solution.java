package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        double i = 0;
        double sum = 0;
        while (true)
        {
            double a = Integer.parseInt(buf.readLine());
            if (a != -1)
            {
                sum += a;
            }
            else
            {
                break;
            }
            i++;
        }
        double mid = sum / i;
        System.out.println(mid);
    }
}

//-100 0 100 -1
//1 2 2 4 5 -1, программа должна вывести 2.8.