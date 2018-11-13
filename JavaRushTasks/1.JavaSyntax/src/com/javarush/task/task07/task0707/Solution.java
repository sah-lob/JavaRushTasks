package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> a1  = new ArrayList<String>();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        a1.add("four");
        a1.add("five");
        System.out.println(a1.size());
        for(String s : a1 ){
            System.out.println(s);
        }
    }
}

/*

public static void main(String[] args)
{
Reader r = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(r);

//ввод строк с клавиатуры
ArrayList list = new ArrayList();
for (int i = 0; i < 10; i++)
{
  String s = reader.readLine();
  list.add(s);
}

//вывод содержимого коллекции на экран
for (int i = 0; i < list.size(); i++)
{
  int j = list.size() - i - 1;
  System.out.println( list.get(j) );
}
}

 */
