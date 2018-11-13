package com.javarush.task.task03.task0315;



public class Solution {
    public static void main(String[] args) {
        Red r=new Red();
        Orange o=new Orange();
        Yellow y=new Yellow();
        Green g=new Green();
        Blue b=new Blue();
        Indigo i=new Indigo();
        Violet vt=new Violet();
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
   /* Каждый охотник желает знать…
        Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
        Каждый объект при создании выводит на экран определенный цвет.


        Требования:
        1. Программа должна выводить текст.
        2. Нужно создать 7 различных объектов, отвечающих за цвета.
        3. Порядок создания объектов должен соответствовать порядку цветов в радуге.
        4. Классы отвечающие за цвета изменять нельзя.
        5. Выведенный текст должен соответствовать заданию.  */