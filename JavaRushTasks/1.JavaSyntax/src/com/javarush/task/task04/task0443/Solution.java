package com.javarush.task.task04.task0443;


/*
Как назвали, так назвали
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        myName();
    }
    public static void  myName(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.println("Меня зовут " + s + ".");
        System.out.println("Я родился " + c + "." + b + "." + a);
    }
}