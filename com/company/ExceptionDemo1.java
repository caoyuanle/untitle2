package com.company;

public class ExceptionDemo1 {
    static void demomethod() {
        try {
            throw new NullPointerException("demo1");
            //抛出一个空指针异常；

        } catch (NullPointerException e) {
            System.out.println("caught inside method");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demomethod();
        } catch (NullPointerException e) {
            //处理被demomethod()中的catch块抛出的异常
            System.out.println("caught in main:" + e);

        }
    }

}
