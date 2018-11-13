package com.javarush.task.task21.task2113;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private ArrayList<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(ArrayList horses){
        this.horses = horses;
    }

    static Hippodrome game;

    public static void main(String[] args) {

        game = new Hippodrome(new ArrayList<Horse>());

        game.getHorses().add(new Horse("First", 3, 0 ));
        game.getHorses().add(new Horse("Second", 3, 0 ));
        game.getHorses().add(new Horse("Third", 3, 0 ));



        game.run();
        game.printWinner();

    }

    public void run(){
        for (int i = 0; i<100; i++){
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void move(){
        for(int i = 0; i<horses.size(); i++){
    horses.get(i).move();}
    }
    public void print(){
        for(int i = 0; i<horses.size(); i++){
            horses.get(i).print();
        }
        for (int i = 0; i<10; i++) {
            System.out.println("");
        }
    }

    public Horse getWinner(){
        double distanse = horses.get(0).distance;
        int j = 0;
        for (int i = 0; i<horses.size(); i++){
         if(horses.get(i).distance>distanse){
             j = i;
         }
        }
        return horses.get(j);
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().name + "!" );
    }
}
