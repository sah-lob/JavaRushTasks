package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

import static com.javarush.task.task03.task0307.Solution.Zerg.*;

public class Solution {
    public static void main(String[] args) {


        Zerg[] zergs = new Zerg[10];
        for ( int i = 0 ; i < 10 ; i++) {
            zergs[i] = new Zerg();
            zergs[i].name = "Zerg " + i;
        }

        Protoss[] protosses = new Protoss[5];
        for ( int i = 0 ; i < 5 ; i++) {
            protosses[i] = new Protoss();
            protosses[i].name = "Protoss " + i;
        }

        Terran[] terrans = new Terran[12];
        for ( int i = 0 ; i < 12 ; i++) {
            terrans[i] = new Terran();
            terrans[i].name = "Terran " +i;
        }
    }


    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}


/*Создать 10 зергов, 5 протоссов и 12 терран.
        Дать им всем уникальные имена.


        Требования:
        1. Нужно создать 10 объектов типа Zerg и каждому из них дать свое имя.
        2. Нужно создать 5 объектов типа Protoss и каждому из них дать свое имя.
        3. Нужно создать 12 объектов типа Terran и каждому из них дать свое имя.
        4. Нельзя изменять классы Zerg, Protoss и Terran.





ublic static void main(String[] args) {
        //напишите тут ваш код

        int count = 10;
        Zerg[] zergs = new Zerg[count];

        for (int i = 0 ; i < count ; i++) {
        zergs[i] = new Zerg();
        zergs[i].name = "Zerg " + i;
        }



        count = 5;
        Protoss[] protoss = new Protoss[count];

        for (int i = 0 ; i < count ; i++) {
        protoss[i] = new Protoss();
        protoss[i].name = "Protoss " + i;
        }

        count = 12;
        Terran[] terran = new Terran[count];

        for (int i = 0 ; i < count ; i++) {
        terran[i] = new Terran();
        terran[i].name = "Terran " + i;
        }
        }

       */


