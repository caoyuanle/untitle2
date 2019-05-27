package com.company;

public class Student implements Student_info {
    String name;
    String sex;
    int birth_year;
    public Student(String n,String s,int b){
        name=n;
        sex=s;
        birth_year=b;
    }
    public int age(){
        return year-birth_year;
    }
    public void output(){
        System.out.println(this.name+" "+this.sex+" "+this.age()+"岁");
    }
    public static void main(String[] args){
        Student stu=new Student("小红","女",1983);
        stu.output();
    }

}
