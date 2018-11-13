package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {
        }

        public interface Fly {
            public void fly();
        }

        public interface Move {
            public void move();
        }

        public interface Eat {
            public void eat();
        }

        public class Dog implements Solution.Move, Solution.Eat {
            public void move(){};
            public void eat(){};
        }

        public class Duck implements Solution.Move, Solution.Fly, Solution.Eat {
            public void fly(){};
            public void eat(){};
            public void move(){};
        }

        public class Car implements Solution.Move {
            public void move(){};
        }

        public class Airplane implements Solution.Move, Solution.Fly {
            public void move(){};
            public void fly(){};
        }
    }