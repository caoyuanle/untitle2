package com.company;

public class T1 {
    public static void main(String[] args) {
        int j=0;
        for(int i=100;i<=300;i++,j++){
            if(i%3!=0)
                System.out.println(i+" ");
                if(j%5==0){
                System.out.println("\t");
                }
            continue;
            }
        }
    }

