package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list= new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(Integer.parseInt(s));
        }

        int count = 1;
        int buf=0;
        for (int i = 0; i <list.size()-1 ; i++) {
            if (list.get(i)==list.get(i+1))
            {
                count +=1;
            }
            else { if (count >buf)

                buf =count;
                count=1;
            }

        }
        if (count>buf)
            System.out.println(count);
        else System.out.println(buf);

    }
}

//2, 4, 4, 4, 8, 8, 9, 12, 12, 14: