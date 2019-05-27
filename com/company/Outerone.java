package com.company;

public class Outerone {
    private int x = 3;
    InnerOne ino = new InnerOne();

    public class InnerOne {   //内部类
        private int y = 5;

        public void innerMethod() {
            System.out.println("y is " + x);
        }

        public void innerMethod2() {
            System.out.println("x2 is " + x);  //访问外部类变量
        }
    }

    public void outerMethod() {
        System.out.println("x is " + x);
        ino.innerMethod();
        ino.innerMethod2();
    }

    public static void main(String[] args) {
        Outerone my = new Outerone();
        my.outerMethod();
    }
}
