package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight = 2;
    String address;
    String color = "gray";



    public void initialize(String name){
        this.name = name;
        this.age=3;
        this.weight=3;
        this.color="white";
    }
    public void initialize (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color="white";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.weight = 23;
        this.age= age;
        this.color= "ew";
        //this.address= "perocvj";
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age=3;
    }

    public void initialize(int weight,String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age=3;
    }

    public static void main(String[] args) {

    }
}

 //   У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.