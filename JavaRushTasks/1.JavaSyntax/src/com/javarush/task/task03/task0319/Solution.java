package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name = reader.readLine();
    String n1 = reader.readLine();
    int n01 = Integer.parseInt(n1);
    String n2 = reader.readLine();
    int n02 = Integer.parseInt(n2);

        System.out.println(name + " получает " + n01 + " через " + n02 + " лет.");
    }
}

/*

"name "получает " + n01 + " через " + n02 + " лет."
package com.javarush.task.task03.task0318;

        import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
*/