package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public class Cat implements Run,Climb {
        public void climb(){};
        public void run(){};
    }

    public class Dog implements Run {
        public void run(){};
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Run, Fly{
        public void run(){};
        public void fly(){};
    }
    public interface Fly{
        public void fly();
    }
    public interface Climb{
        public void climb();
    }
    public interface Run{
        public void run();
    }
}
