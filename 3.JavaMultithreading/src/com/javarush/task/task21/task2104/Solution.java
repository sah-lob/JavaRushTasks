package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return Objects.equals(first, solution.first) && Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
         return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}



//public class Solution {
//    private final String first, last;
//    public Solution(String first, String last) {
//        this.first = first;
//        this.last = last;
//    }
//    //Метод equals должен проверять является ли переданный объект объектом класса Solution
//    @Override
//    public boolean equals(Object o)
//    {
//        if (o == null)
//            return false;
//        if (!(o instanceof Solution)){
//            return false;
//        }
//        if (this == o) return true;
//        Solution solution = (Solution) o;
//        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
//        if (last != null ? !last.equals(solution.last) : solution.last != null) return false;
//        return true;
//    }
//    @Override
//    public int hashCode()
//    {
//        int result = first != null ? first.hashCode() : 0;
//        result = 31 * result + (last != null ? last.hashCode() : 0);
//        return result;
//    }
//    public static void main(String[] args) {
//        Set<Solution> s = new HashSet<>();
//        s.add(new Solution("Donald", "Duck"));
//        System.out.println(s.contains(new Solution("Donald", "Duck")));
//    }
//}