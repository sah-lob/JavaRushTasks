package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        String a="";
        int i,b=0;
        for (i = 1; i<11; i++)
        {
            if ( i == 1 ) {
                a = "" + i;
                b = (b + i);
            }
            else

            {a = a +"+"+ i;
                b = (b + i);}
          System.out.println(b);
        }
    }
}


/*
Требования:
        1. Программа должна выводить текст.
        2. Выведенный текст должен содержать 10 строк.
        3. Число в каждой новой строке должно быть больше предыдущего.
        4. Выводимый текст должен соответствовать заданию.*/