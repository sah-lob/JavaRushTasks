package com.javarush.task.task26.task2601;

import java.util.*;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {

        Integer[] massiv = {1, 1, 2, 3, 4, 5};
        massiv = sort(massiv);

        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int n = array.length;
        double mediana = n % 2 == 1
                ? array[n / 2]
                : (double)(array[n / 2 - 1] + array[n / 2]) / 2;

        System.out.println(mediana);

        // distance
        Map<Double, int[]> map = new TreeMap<>();
        for (Integer i : array) {
            double distance = Math.abs(mediana - i);
            if (map.containsKey(distance)) {
                int[] newArr = new int[map.get(distance).length + 1];
                System.arraycopy(map.get(distance), 0, newArr, 0, map.get(distance).length);
                newArr[map.get(distance).length] = i;
                map.put(distance, newArr);
            } else {
                map.put(distance, new int[]{i});
            }
        }

        Integer[] result = new Integer[n];
        int i = 0;
        for (Map.Entry<Double, int[]> pair : map.entrySet()) {
            int[] arr = pair.getValue();
            Arrays.sort(arr);
            for (int value : arr) {
                result[i++] = value;
            }
        }

        return result;
    }
}
