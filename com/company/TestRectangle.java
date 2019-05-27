package com.company;

import java.util.Scanner;

class Rectangle {
    int height;
    int width;

    public int getPerimeter() {
        return 2 * (height + width);
    }

    public int getArea() {
        return height * width;
    }
}

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle zheng = new Rectangle();

        zheng.height = 20;
        zheng.width = 10;
        int Perimeter = zheng.getPerimeter();
        System.out.println("周长为" + Perimeter);
        int area = zheng.getArea();
        System.out.println("面积为" + area);
    }
}




