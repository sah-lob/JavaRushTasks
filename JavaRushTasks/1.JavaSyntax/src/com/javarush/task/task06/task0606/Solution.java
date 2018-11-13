package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int length = a.length();
        int b = Integer.parseInt(a);

        for (int i = 0; i != length ; i++) {
            int nums = b % 10;
            int s = nums % 2;
            if (s == 1)
                odd = odd + 1;
            else
                even = even + 1;
            b = (b - nums) / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
