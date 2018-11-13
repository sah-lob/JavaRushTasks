package com.javarush.task.task26.task2606;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* 
Тот, кто любит труд, не нуждается в развлечениях
*/
public class Solution {
    public static void main(String[] args) {
        String x = "Hello";
        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        x = x.toUpperCase();
        System.out.println(x);
    }
}
