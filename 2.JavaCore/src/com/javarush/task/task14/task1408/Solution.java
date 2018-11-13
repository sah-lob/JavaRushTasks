package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.RUSSIA);
        Hen hen2 = HenFactory.getHen(Country.BELARUS);
        Hen hen3 = HenFactory.getHen(Country.MOLDOVA);
        Hen hen4 = HenFactory.getHen(Country.UKRAINE);
        System.out.println(hen.getDescription());
        System.out.println(hen2.getDescription());
        System.out.println(hen3.getDescription());
        System.out.println(hen4.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if(country.equals(Country.RUSSIA)){
            return new RussianHen(); }
            if(country.equals(Country.BELARUS)){
                return new BelarusianHen(); }
            if(country.equals(Country.MOLDOVA)){
                return new MoldovanHen(); }
            if(country.equals(Country.UKRAINE)){
                return new UkrainianHen(); }
            else return null;
        }
    }


}
