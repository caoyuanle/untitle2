package com.company;

class car{
    public String Name;
    public char Color;
    public String Style;
    public car(String Name,char Color,String Style){
        this.Name=Name;
        this.Color=Color;
        this.Style=Style;
    }
}

public class Test5 {
    public static void main(String[] args) {
        car car1=new car("npcy",'R',"1");
        System.out.println(car1.Name);
    }

}
