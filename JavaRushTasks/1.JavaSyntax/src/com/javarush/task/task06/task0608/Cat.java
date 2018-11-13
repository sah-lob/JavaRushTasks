package com.javarush.task.task06.task0608;

/* 
Статические методы для кошек
*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount()
        { return catCount; }  //напишите тут ваш код

    public static void setCatCount(int catCount)
        { Cat.catCount = catCount; }


    public static void main(String[] args) {
        System.out.println("Начальное значение: " + catCount);
        int a = getCatCount();
        System.out.println("После геттера (но без сеттера) " + a);
        setCatCount(5);
        int b = getCatCount();
        System.out.println("На этом этапе сеттер уже установил значение 5, и новое значение int b, получим через геттер: " + b);
        System.out.println("При этом, значение переменной a: " + a);
        int c = getCatCount();
        System.out.println("После того как сеттер установил значение 5, все новые переменные через геттер будут: " + c);
        int d = Cat.catCount;
        System.out.println("Даже если новая переменная создана без геттера, она все равно уже изменена сеттером и равна: " + d);
    }
}


   /*
   public static int    getCatCount() 			{ return catCount; }
public static void setCatCount(int catCount)    { Cat.catCount = catCount; }

        Требования:
                1. Добавь в класс метод getCatCount.
                2. Метод getCatCount должен возвращать int.
                3. Метод getCatCount должен возвращать значение переменной catCount.
                4. Добавь в класс метод setCatCount, принимающий int.
                5. Метод setCatCount ничего не должен возвращать.
                6. Метод setCatCount должен присваивать переменной catCount переданное значение.
*/