package com.javarush.task.task26.task2608;

/* 
Мудрый человек думает раз, прежде чем два раза сказать
*/
public class Solution {
    volatile int var1;
    volatile int var2;
    volatile int var3;
    volatile int var4;
    private Object o1;
    private Object o2;

    public Solution(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int getSumOfVar1AndVar2() {
        int qwe;
        synchronized (o1){
            qwe = var1 +var2;}
        return qwe;
    }

    public int getSumOfVar3AndVar4() {
        int qwe;
        synchronized (o2){
            qwe = var3 +var4;}
        return qwe;
    }

    public static void main(String[] args) {

    }
}
