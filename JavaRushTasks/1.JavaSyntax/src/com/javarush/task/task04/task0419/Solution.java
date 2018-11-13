package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader(System.in));

        String de = reader.readLine();
        int a = Integer.parseInt(de);
        String dw = reader.readLine();
        int b = Integer.parseInt(dw);

        String dq = reader.readLine();
        int c = Integer.parseInt(dq);
        String dwq = reader.readLine();
        int d = Integer.parseInt(dwq);

        int q, w;

        if (a>= b) {
            q = a;
        }
        else {q = b;}


        if (c>= d) {
            w = c;
        }
        else {w = d;}


        if (q>=w){System.out.println(q);}
        else {System.out.println(w);}//напишите тут ваш код
    }
}
