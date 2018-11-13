package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream password = new ByteArrayOutputStream();
        List<Character> list = new ArrayList<>();
        Random random = new Random();

        int num_of_numbers = random.nextInt(5) + 1;
        int num_of_letters = 8 - num_of_numbers;
        int num_of_big_letters = random.nextInt(num_of_letters - 2) + 1;
        int num_of_small_letters = num_of_letters - num_of_big_letters;

        for (int i = 0; i < num_of_numbers; i++) {
            int w = random.nextInt(10)+48;
            char b = (char) w;
            list.add(b);
        }
        for (int i = 0; i < num_of_big_letters ; i++) {
            int w = random.nextInt(25)+65;
            char b = (char) w;
            list.add(b);
        }
        for (int i = 0; i < num_of_small_letters ; i++) {
            int w = random.nextInt(25)+97;
            char b = (char) w;
            list.add(b);
        }

        StringBuilder output = new StringBuilder(8);

        while(list.size()!=0){
            int randPicker = (int)(Math.random()*list.size());
            output.append(list.remove(randPicker));
        }
        String s = output.toString();

        byte[] array = s.getBytes();
        password.write(array,0,8);
        return password;
    }
}