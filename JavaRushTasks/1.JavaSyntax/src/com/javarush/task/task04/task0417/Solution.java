package com.javarush.task.task04.task0417;

/*
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String aa = reader.readLine();
        int a = Integer.parseInt(aa);
        String ab = reader.readLine();
        int b = Integer.parseInt(ab);
        String ac = reader.readLine();
        int c = Integer.parseInt(ac);

        if (a == b) {
            if (a == c) {System.out.println(a + " " + b + " " + c );}
            else {System.out.println(a + " " + b);}
        }

        if (a == c & a !=b) { System.out.println(a + " " + c);}
        if (b == c & b !=a) { System.out.println(b + " " + c);}

    }
}

/*
public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
 */
