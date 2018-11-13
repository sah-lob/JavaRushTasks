package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> penis= new HashMap<>();
        for (int i = 0; i<10;i++){
            penis.put("gjkl;"+i,i*100);
        }
        return penis;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>> penis = map.entrySet().iterator();
        while (penis.hasNext()){
            Map.Entry<String,Integer> s = penis.next();
            int b = s.getValue();
            if(b<500){
                penis.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}

/*

public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> i = map.entrySet().iterator();
        while((i.hasNext()))
        {
            Map.Entry<String, Integer> p = i.next();
            int b = p.getValue();
            if(b<500)
            {
                i.remove();
            }
        }
    }
 */