package com.company;

public class test6 {
    public static void main(String[] args) {
        String a=("Hello World");
        System.out.println(a);
        int b=a.charAt(0);
        if(a.charAt(0)>=65&&a.charAt(0)<=97){
            int count=0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)>=65&&a.charAt(i)<=97) {
                    count=count+1;
//                  count+=1或者count++
                    System.out.println(a.charAt(i)+"\t");
                }
            }
            System.out.println(count);
        }
        else
            System.out.println("第一个字符是小写字母");
    }
}
