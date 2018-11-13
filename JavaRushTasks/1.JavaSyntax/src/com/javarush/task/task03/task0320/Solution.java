package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      String name = reader.readLine();

      System.out.println( name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}



/*name + " зарабатывает $5,000. Ха-ха-ха!"
*
*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

     String name = reader.readLine();
     String sAge = reader.readLine();
     int age = Integer.parseInt(sAge);

     System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
   }
*
*
*
*
* */