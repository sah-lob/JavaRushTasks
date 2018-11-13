package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

import java.math.BigDecimal;

public class Solution {
    public Solution(Boolean af) {}
    public Solution(int a, int b) {}
    public Solution(int a, int b, int c) {}


    protected Solution(float a) {}
    protected Solution(float a, float b) {}
    protected Solution(float a, float b, float c) {}


    Solution(double a) {}
    Solution(double a, double b) {}
    Solution(double a, double b, double c) {}


    private Solution(String a) {}
    private Solution(String a, String b) {}
    private Solution(String a, String b, String c) {}
}

