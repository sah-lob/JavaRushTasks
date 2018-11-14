package com.javarush.task.task37.task3702.female;

import com.javarush.task.task37.task3702.Human;

public class FemaleFactory {

    public Human getPerson(int age){
        if(age>=20){
            return new Woman();
        } else if(age<20 && age>12){
            return new TeenGirl();
        } else return new KidGirl();
    }
}
