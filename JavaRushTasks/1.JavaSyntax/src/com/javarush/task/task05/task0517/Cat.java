package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
   String name = "penis";
   int weight = 23;
   int age = 23;
   String address = "perovo";
   String color = "yellow";


   //1
   public Cat (String name){
       this.name = name;
       this.age = 2;
       this.color = "black";
       this.weight = 2;
       this.address = null;
   }
   //2

    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "skuns";
        this.address = null;
    }
    //3
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
        this.color = "skuns";
        this.weight = 2;
        this.address = null;
    }
    //4
    public Cat (int weight, String color){
        this.name = null;
        this.age = 2;
        this.color = color;
        this.weight = weight;
        this.address = null;
    }
    //5 вес, цвет, адрес и инициализирующий все переменные класса, кроме имен
    public Cat (int weight, String color, String address){
        this.weight = weight;
        this.color =  color;
        this.address = address;
        this.name = null;
    }

    public static void main(String[] args) {

    }
}


/*

Создать класс Cat (кот) с пятью конструкторами:
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет, (имя, адрес и возраст – неизвестные. Кот — бездомный)
— вес, цвет, адрес (чужой домашний кот)

Задача конструктора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.



6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
7. У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
 */