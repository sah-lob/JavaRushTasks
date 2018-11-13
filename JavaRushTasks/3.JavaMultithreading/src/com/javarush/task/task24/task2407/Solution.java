package com.javarush.task.task24.task2407;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* 
Реализация интерфейса используя локальный класс
*/
public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
        String s = "qwer";
        char[] sa = s.toCharArray();
        String d = "qazqaz";
        int k = 0;
        char[] da = d.toCharArray();
        for (int i = 0; i < s.length() ; i++) {
            for (int j =0; j< d.length(); j++ ){
                if (sa[i] == da[j]){
                    k = k+1;
                }
            }
        }
        k = (int) Math.sqrt(k);
        ArrayList<String> qw = new ArrayList<>();
        qw.add(s);
        qw.add(d);
        s = s.toUpperCase();
        Collections.sort(qw);
        if(qw.get(0) == s){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println( s.substring(0, 1).toUpperCase() + s.substring(0, 1).toUpperCase()  );
        if(s.equals(d)){
            System.out.println(s.length());
        }
    }

    static boolean isAnagram(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        char[] aa = a.toCharArray();
        char[] ba = b.toCharArray();
        HashMap<Character,Integer> hash = new HashMap<>();
        hash.put(aa[0],1);
        for (int i = 1; i < a.length() ; i++) {
            for( int j =0; j< hash.size();j++){
                if(hash.containsKey(aa[i])){
                    hash.merge(aa[i], 2, Integer::sum);
                } else hash.put(aa[i],1);
            }
        }
        HashMap<Character,Integer> hash2 = new HashMap<>();
        hash2.put(ba[0],1);
        for (int i = 1; i < b.length() ; i++) {
            for( int j =0; j< hash2.size();j++){
                if(hash2.containsKey(ba[i])){
                    hash2.merge(ba[i], 1, Integer::sum);
                } else hash2.put(ba[i],1);
            }
        }

        System.out.println(hash);
        System.out.println(hash2);
        if (hash.equals(hash2)){
            return true;
        } else {
            return false;
        }
    }
}
