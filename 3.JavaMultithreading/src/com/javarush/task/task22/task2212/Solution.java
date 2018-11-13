package com.javarush.task.task22.task2212;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверка номера телефона

+ 1) если номер начинается с '+', то он содержит 12 цифр
+ 2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
3) может содержать 0-2 знаков '-', которые не могут идти подряд
4) может содержать 1 пару скобок '(' и ')' , причем если она есть, то она расположена левее знаков '-'
5) скобки внутри содержат четко 3 цифры
+ 6) номер не содержит букв
+ 7) номер заканчивается на цифру
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {


        if (telNumber == null)
            return false;

        Pattern p = Pattern.compile("((^\\+[\\(\\-]?(\\d[\\(\\)\\-]?){11}\\d$)|(^\\([\\(\\-]?(\\(?\\)?\\-?\\d){9}\\d$)|(^\\d[\\(\\-]?(\\(?\\)?\\-?\\d){8}\\d$))");
        Pattern p2 = Pattern.compile("(\\+|\\d+|\\d+\\(\\d{3}\\)\\d+|\\(\\d{3}\\)\\d+)+\\-?\\d+\\-?\\d+");
        Matcher m = p.matcher(telNumber);
        Matcher m2 = p2.matcher(telNumber);
        return m.matches() && m2.matches() ;
    }


    public static void main(String[] args) {

        System.out.println(checkTelNumber("+380501234567"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("+38050123-45-67"));
        System.out.println(checkTelNumber(null));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("+38(050)1-23-45-6-7"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));
    }
}