package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {
    }

    protected void finalize() throws Throwable{

        System.out.println("Cat was destroyed");
    }

}

class Dog {


    protected void finalize() throws Throwable {
        System.out.println("Dog was destroyed");
    }
}

 /*   protected void finalize() throws Throwable
    {
        System.out.println(name + " destroyed");
    }

    В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.


        Требования:
        1. В классе Cat должен быть void метод finalize.
        2. В классе Dog должен быть void метод finalize.
        3. Метод finalize класса Cat должен выводить на экран "Cat was destroyed".
        4. Метод finalize класса Dog должен выводить на экран "Dog was destroyed".

        */