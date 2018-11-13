package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {

    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable,Updatable{
        public void onSelect(){};
        public void refresh(){};
    }
    //напишите тут ваш класс
}
