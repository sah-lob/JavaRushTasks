package com.javarush.task.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String,String> createMap(){
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i++<10;map.put("lastname"+i,"name"+i));
        for(HashMap.Entry<String,String> pair:map.entrySet())System.out.println(pair.getKey()+" - "+pair.getValue());
        return map;
    }
    public static int getCountTheSameFirstName(HashMap<String,String> map,String name){
        int count=0;
        for(String s:map.values())if(s.equals(name))count++;
        return count;
    }
    public static int getCountTheSameLastName(HashMap<String,String> map,String lastName){
        int count=0;
        for(String s:map.keySet())if(s.equals(lastName))count++;
        return count;
    }


    public static void main(String[] args) {

    }
}
