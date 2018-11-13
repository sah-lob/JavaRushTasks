package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        System.out.println("it's a text for testing");
//        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        StringBuilder stringBuilder = new StringBuilder(result);
        String reverseString = stringBuilder.toString();
        char [] qw = reverseString.toCharArray();
        for(int i = 0 ; i< qw.length;i++){
            if (qw[i] == 't' && qw[i+1] == 'e'){
                qw[i] = '?';
                qw[i+1] = '?';
            }
        }
        reverseString = String.valueOf(qw);
        System.out.println(reverseString);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
