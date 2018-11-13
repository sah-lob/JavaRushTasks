package com.javarush.task.task19.task1911;

/* 
Ридер обертка
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

        StringBuilder stringBuilder = new StringBuilder(result);
        String reverseString = stringBuilder.toString()+ "rtyu";
        String reverseString2 = reverseString.toUpperCase() + " " + reverseString;

        //выводим ее в консоль

        System.out.println(reverseString2);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
