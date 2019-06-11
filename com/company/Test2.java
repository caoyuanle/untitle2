package com.company;

import org.omg.SendingContext.RunTime;

class NoValueException extends RuntimeException{
    NoValueException(String message){
        super(message);
    }
}
class Rectangle1{
    int width;
    int length;
    Rectangle1(int width,int length){
        if(width<=0 || length<=0){
            throw new NoValueException("长或宽存在非法值");
        }
        this.length=length;
        this.width=width;
    }
    public int getArea(){
        final int i = width * length ;
        return i;
    }
    public void getPerimeter(){

        System.out.println("矩形的周长是："+2*(width+length));
    }
}
public class Test2{
    public static void main(String[] args){
        Rectangle1 Rect=new Rectangle1(4,5);
        System.out.println("矩形的面积是"+Rect.getArea());
        Rect.getPerimeter();
    }
}