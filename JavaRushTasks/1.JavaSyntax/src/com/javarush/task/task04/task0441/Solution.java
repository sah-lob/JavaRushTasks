package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a < b && a > c) || (a < c && a > b))
            System.out.println(a);
        if ((b < c && b > a) || (b < a && b > c))
            System.out.println(b);
        if ((c < b && c > a) || (c < a && c > b))
            System.out.println(c);
        if (a == b && b == c) {
            System.out.println(a);
            return;
        }
        if (a == b || b == c) {
            System.out.println(b);
            return;
        }
        if (a == c || a == b) {
            System.out.println(a);
            return;
        }
        if (b == c || c == a) {
            System.out.println(c);

        }
    }
}




