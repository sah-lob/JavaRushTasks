package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine()), "UTF-8"));
        reader.close();
        StringBuilder sb = new StringBuilder();

        while (fr.ready()) {
            sb.append(fr.readLine());
            sb.append(" ");
        }
        fr.close();
        String[] allWords = sb.toString().split(" ");
        List<String> list = new ArrayList<>();
        Arrays.stream(allWords).forEach(a -> list.add(a));
        String reverse;

        Outer: for (int i = 0; i < list.size(); i ++) {
            reverse = new StringBuilder().append(list.get(i)).reverse().toString();
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).equals(reverse)) {
                    Pair newPair = new Pair(list.get(i), list.get(j));
                    result.add(newPair);
                    System.out.println(newPair);
                    list.remove(j);
                    list.remove(i);
                    i = -1;
                    continue Outer;
                }
            }
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair(String  first, String second) {
            this.first = first;
            this.second = second;
        }

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}