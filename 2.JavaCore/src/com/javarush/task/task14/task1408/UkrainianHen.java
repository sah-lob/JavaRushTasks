package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу " + this.getCountOfEggsPerMonth() +" В день.";
    };
}
