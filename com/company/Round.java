package com.company;

import java.util.*;
class Circle{
    public double area(double radius){
        return radius*radius*3.14;
    }
    public double perimeter(double radius){
        return 2*radius*3.14;
    }
    public void print(double radius){
        System.out.println("圆的周长为："+this.perimeter(radius)+"\n"+"圆的面积为:"+this.area(radius));
    }
}
public class Round {
    public static void main(String[]args){
        Circle c=new Circle();
        System.out.println("请输入圆的半径:");
        Scanner s=new Scanner(System.in);
        double radius=s.nextDouble();
        c.print(radius);
    }
}