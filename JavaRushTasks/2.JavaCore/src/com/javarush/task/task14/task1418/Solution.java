package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь четыре ошибки
*/

public class Solution {
    public static void main(String[] args){
        List<Number> list=new LinkedList<>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);
    }
    static void initList(List list){
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90/-3));
        list.remove(new Double("123e-445632"));
    }
    static void printListValues(List list){
        for(int i=0,k=list.size();i<k;System.out.println(list.get(i++)));
    }
    static void processCastedObjects(List list){
        for(Object object : list){
            if(object instanceof Float){
                Float a=(Float)object;
                System.out.println("Is float value defined? "+!(a.isNaN()));
            }else if(object instanceof Double){
                Double a=(Double)object;
                System.out.println("Is double value infinite? "+a.isInfinite());
            }
        }
    }
}
