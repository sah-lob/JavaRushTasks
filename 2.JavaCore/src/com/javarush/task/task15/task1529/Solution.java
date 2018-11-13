package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    static {
        try{
            reset();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static Flyable result;
    public static void reset()throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if("helicopter".equals(s))
        {
            result = new Helicopter();
        }
        if("plane".equals(s))
        {
            int  d = Integer.parseInt(reader.readLine());
            result = new Plane(d);
        }
        reader.close();
    }
}