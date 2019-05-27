package com.company;

public class StaticTest {
    public static class Person {
        private int age;
        private String name;
        static int count = 0;

        Person(String n, int a) {
            name = n;
            age = a;
            count++;
        }

        public void display() {
            System.out.println("count=" + count + "\t" + "name=" + name + "\t" + "age=" + age);
        }
    }

    public static void main(String[] args) {
        StaticTest.Person p1 = new StaticTest.Person("li", 12);
        p1.display();
        StaticTest.Person p2 = new StaticTest.Person("xiaomi", 45);
        p2.display();

    }
}
