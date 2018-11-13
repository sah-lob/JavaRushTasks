package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;

/*
Алгоритмы-числа
*/
public class Solution {

    public static ArrayList<Long> getNumbers(long N) {

        ArrayList<Long> result = new ArrayList<>();

        for(int i = 0; i<N; i++){

        }

        //----------------- boring --------------------
//        ArrayList<Long> result = new ArrayList<>();
//        ArrayList<Long> result2 = new ArrayList<>();
//
//        int e = 0;
//        long peni = 0;
//        long chislo;
//
//        for(long i = 0; i< N; i++){
//
//            chislo = i;
//
//            while (true){
//
//                if(chislo>9){
//                    result.add(chislo%10);
//                    chislo = chislo/10;
//                    e = e+1;
//                }
//        else{
//
//            result.add(chislo%10);
//
//                    for(int j = 0; j<result.size(); j++){
////                        if(result.get(j) == 0){peni = peni + 0;}
////                        if(result.get(j) == 1){peni = peni + 1;}
////                        if(result.get(j) == 2){peni = peni + 4;}
////                        if(result.get(j) == 3){peni = peni + 9;}
////                        if(result.get(j) == 4){peni = peni + 16;}
////                        if(result.get(j) == 5){peni = peni + 25;}
////                        if(result.get(j) == 6){peni = peni + 36;}
////                        if(result.get(j) == 7){peni = peni + 49;}
////                        if(result.get(j) == 8){peni = peni + 64;}
////                        if(result.get(j) == 9){peni = peni + 81;}
//
//                        peni = (long) (peni + Math.pow(result.get(j),e+1));
//                    }
//
//                    if(peni == i && i!=0){
//                        result2.add(i);
//                    }
//                    result.clear();
//                    peni = 0;
//                    e=0;
//            break;
//            }
//        }
//        }
//        if(N==0 || N==1 || N<0){
//            return null;
//        } else return result2;
        return null;
    }


    public static void main(String[] args) {
//        Long t0 = System.currentTimeMillis();
//        ArrayList<Long> we = getNumbers(100000000);
//        try {
//        for(int i =0; i<we.size(); i++){
//            System.out.println(we.get(i));
//        }
//        } catch (NullPointerException e){
//            System.out.println("null");
//        }
//        Long t1 = System.currentTimeMillis();
//        System.out.println("time: " + (t1 - t0) / 1000d + " sec");
//        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        ArrayList<Long> result = getNumbers(11111);
        ArrayList<Long> result1 = getNumbers(1);
        System.out.println(Arrays.toString(new ArrayList[]{result}));
        System.out.println(Arrays.toString(new ArrayList[]{result1}));
    }
}

//Long.MAX_VALUE)