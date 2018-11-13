package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double answer = (i *1.1);
        return answer;

        //напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}



/* Требования:
        1. Метод addTenPercent должен увеличивать переданное число на 10% процентов.
        2. Тип возвращаемого значения у метода addTenPercent должен соответствовать заданию.
        3. Метод main должен вызывать метод addTenPercent.
        4. Метод main должен выводить результаты вызова на экран.
        5. Метод addTenPercent не должен ничего выводить на экран.  */
