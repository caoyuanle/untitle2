package com.company;
/*构造方法的重载*/
class Person{
    private String name;
    private int age;
    public Person(String n ,int a ){
    name=n;
    age=a;
    }
    public String talk() {
        return "我是:" + name + ",今年：" + age + "岁";
    }
}
public class Test1 {
    public static void main(String[] args){
        Person person=new Person("npcy",20);
        System.out.println(person.talk());
    }
}
