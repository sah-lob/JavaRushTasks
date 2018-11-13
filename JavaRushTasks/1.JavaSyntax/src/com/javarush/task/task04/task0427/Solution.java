package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        int len1 = sAge.length();




            if (len1 == 1 & a>0) {
                if (a % 2 == 0) {
                    System.out.println("четное однозначное число");
                } else System.out.println("нечетное однозначное число");
            }
            if (len1 == 2) {
                if (a % 2 == 0) {
                    System.out.println("четное двузначное число");
                } else System.out.println("нечетное двузначное число");
            }
            if (len1 == 3) {
                if (a % 2 == 0) {
                    System.out.println("четное трехзначное число");
                } else System.out.println("нечетное трехзначное число");
            }
    }
}


/*    Программа должна считывать одно число c клавиатуры.
        2. Программа должна использовать команду System.out.println() или System.out.print().
        3. Программа должна выводить только строку-описание числа и больше ничего.
        4. Если число четное и имеет одну цифру, вывести "четное однозначное число".
        5. Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
        6. Если число четное и имеет две цифры, вывести "четное двузначное число".
        7. Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
        8. Если число четное и имеет три цифры, вывести "четное трехзначное число".
        9. Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
        10. Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран */