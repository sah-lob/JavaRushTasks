package com.javarush.task.task23.task2303;

/* 
Запрети создание экземпляров класса
*/
public class Solution {

    public abstract static class Listener {
        public void onMouseDown(int x, int y) {
            //do something on mouse down event
        }

        public void onMouseUp(int x, int y) {
            //do something on mouse up event
        }
    }

    public static void main(String[] args) {

    }

    public class Car
    {
        int width, height;

        public class Door
        {
            int width, height;

            public void setHeight(int height)
            {
                this.height = height;
            }

            public int getHeight()
            {
                if (height!=0)
                    return this.height;
                else
                    return (int)(Car.this.height * 0.8);
            }
        }





    }
}
