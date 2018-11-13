package com.javarush.task.task11.task1121;

/*
Чужой код, незнакомый
 */

public class Solution {
    public static void main(String[] args)
    {
        Cow cow = new Cow();
        Edinorog edinorog = new Edinorog();
        cow.printAll();
        System.out.println("");
        edinorog.printAll();
    }

    static class Cow{
            public void printAll(){
                printPeins();
                printName();
                printColor();
            }
            public void printPeins(){
                System.out.println("penis");
            }
            public void printName(){
                System.out.println("Коровушка");
            }
            public void printColor(){
                System.out.println("Черная");
            }
    }
    static class Edinorog extends Cow{
        public void printName(){
            System.out.println("Единорожик");
        }
    }
}