package com.company;


class Rectangle {
    int height;
    int width;

    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }

    public int getPerimeter() {
        return 2 * (height + width);
    }

    public int getArea() {
        return height * width;
    }
}

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle zheng = new Rectangle(10,20);

        int Perimeter = zheng.getPerimeter();
        System.out.println("周长为:" + Perimeter);
        int area = zheng.getArea();
        System.out.println("面积为:" + area);
    }
}




