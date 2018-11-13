package com.javarush.task.task04.task0406;

/* 
Реализовать метод setName
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }

    public static void main(String[] args) {


    }
}

/* public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
        System.out.println(Cat.catsCount);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setCatsCount(5);
    }
}
    Реализовать метод setName
        Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String fullName равное значению локальной переменной String fullName.


        Требования:
        1. Класс Cat должен содержать только одну переменную fullName.
        2. Переменная fullName должна иметь модификатор доступа private и тип String.
        3. Класс Cat должен содержать только два метода setName и main.
        4. Метод setName должен иметь локальную переменную fullName.
        5. Метод setName класса Cat должен устанавливать значение глобальной переменной private String fullName равным локальной переменной fullName.

        */