package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        if(a<1||b<1)throw new Exception();
        System.out.println(nod(a,b));
    }
    public static int nod(int a,int b){
        if(a==b)return a;
        if(a==0)return b;
        if(b==0)return a;
        if((~a&1)!=0){
            if((b&1)!=0) return nod(a>>1,b);
            else return nod(a>>1,b>>1)<<1;
        }
        if((~b&1)!=0) return nod(a,b>>1);
        if(a>b) return nod((a-b)>>1,b);
        return nod((b-a)>>1,a);
    }
}
