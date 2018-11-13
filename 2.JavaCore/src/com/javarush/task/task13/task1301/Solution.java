package com.javarush.task.task13.task1301;

/*
Пиво
 */

public class Solution {
    public static void main(String[] args) throws Exception {
    Drink beer = new Beer();
    beer.sayThankYou();
    beer.askMore();
    beer.isReadyToGoHome();
    }

    public interface Drink {
        void askMore();
        void sayThankYou();
        boolean isReadyToGoHome();
    }

    public interface Alcogol extends Drink{
        boolean READY_TO_GO_HOME = false;
    }

    public static class Beer implements Alcogol{

        @Override
        public void askMore() {
            System.out.println("Хочу еще");
        }

        @Override
        public void sayThankYou() {
System.out.println("Мои благодарности");
        }

        @Override
        public boolean isReadyToGoHome() {
            System.out.println(READY_TO_GO_HOME);
            return READY_TO_GO_HOME;
        }
    }
}