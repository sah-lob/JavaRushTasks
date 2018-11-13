package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 85;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA+ ". Я несу " + this.getCountOfEggsPerMonth() +" В день.";
    };
}
