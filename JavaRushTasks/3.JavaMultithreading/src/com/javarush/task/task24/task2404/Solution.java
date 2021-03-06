package com.javarush.task.task24.task2404;

import com.javarush.task.task24.task2404.HasHeight;
import com.javarush.task.task24.task2404.HasWidth;
import com.javarush.task.task24.task2404.Point;

/*
Рефакторинг Rectangle
*/
class Solution {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
//        System.out.println(getHeight(rectangle));
//        System.out.println(getWidth(rectangle));
        System.out.println(getHeight(rectangle.castToHasHeight()));
        System.out.println(getWidth(rectangle.castToHasWidth()));
    }

    private static double getHeight(HasHeight rectangle) {
        return rectangle.getHeight();
    }

    private static double getWidth(HasWidth rectangle) {
        return rectangle.getWidth();
    }


    static class Rectangle {

        private final Point point1;
        private final Point point2;

        Rectangle(double x1, double y1, double x2, double y2) {
            point1 = new Point(x1, y1);
            point2 = new Point(x2, y2);
        }

        HasHeight castToHasHeight() {
            return () -> Math.abs(point1.getY() - point2.getY());
        }

        HasWidth castToHasWidth() {
            return () -> Math.abs(point1.getX() - point2.getX());
        }
    }
}