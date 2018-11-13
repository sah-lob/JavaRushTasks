package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        //запоминаем настоящий PrintStream в специальную переменную

        PrintStream consoleStream = System.out;

        //Создаем динамический массив

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        //создаем адаптер к классу PrintStream

        PrintStream stream = new PrintStream(outputStream);

        //Устанавливаем его как текущий System.out

        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();

        //Возвращаем все как было

        System.setOut(consoleStream);

        //разворачиваем строку
        String ss = "";

        StringBuilder stringBuilder = new StringBuilder(result);
        String reverseString = stringBuilder.toString();
        char [] qw = reverseString.toCharArray();
        for(int i = 0 ; i< qw.length;i++){
            if (qw[i] == '1' || qw[i] == '2'|| qw[i] == '3' || qw[i] == '4'|| qw[i] == '5'||qw[i] == '6' || qw[i] == '7' || qw[i] == '8' || qw[i] == '9' || qw[i] == '0'){
                ss = ss+ qw[i];
            }
        }
        reverseString = ss;

        //выводим ее в консоль

        System.out.println(reverseString);
    }
    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
