package com.jo.line;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String [] s=sc.nextLine().split(" ");
            if(s.length==1 && "0".equals(s[0])){
                break;
            }
            int sum=0;
            for(int i=0;i<s.length-1;i++){
                sum=sum+Integer.parseInt(s[i]);
            }
            System.out.println(sum);
        }
    }
}

