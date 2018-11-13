package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {

    int  centerX = 1,centerY = 1, radius = 1, width = 1, color =1;

    public void initialize (int centerX, int centerY,int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize (int centerX, int centerY,int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public void initialize (int centerX, int centerY,int radius , int width, int color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.width = width;
        this.radius = radius;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}
