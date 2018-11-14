package com.javarush.task.task37.task3702.male;

import com.javarush.task.task37.task3702.Human;

public class MaleFactory {

    public Human getPerson(int age){
        if(age>=20){
            return new Man();
        } else if(age<20 && age>12){
            return new TeenBoy();
        } else return new KidBoy();
    }
}
