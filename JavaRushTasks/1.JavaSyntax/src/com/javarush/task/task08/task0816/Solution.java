package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Stallone"+i, (new GregorianCalendar(1985,i,i+1).getTime()));
        }
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            Date date =  pair.getValue();
            if (date.getMonth()>4 && date.getMonth()<8) iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
