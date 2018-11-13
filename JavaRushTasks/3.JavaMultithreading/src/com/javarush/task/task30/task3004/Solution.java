package com.javarush.task.task30.task3004;

import java.util.concurrent.ForkJoinPool;

/* 
Fork/Join
*/
public class Solution {

    private String binatyRepresentationMethod(int x) {
        int a = x % 2;
        int b = x / 2;
        String result = String.valueOf(a);
        if (b > 0) {
            return binatyRepresentationMethod(b) + result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result1 = solution.binatyRepresentationMethod(116);
        System.out.println(result1);

        System.out.println();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        String result2 = forkJoinPool.invoke(new BinaryRepresentationTask(116));
        System.out.println(result2);
    }
}