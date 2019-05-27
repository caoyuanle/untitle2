package com.company;

public class Box {
    int length;
    int width;
    int height;

    public void  setdemo(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void TiJi() {
        int tiji;
        tiji = length * width * height;
        System.out.println("Box的体积是：" + tiji);
    }

    public static void main(String[] args) {

        Box a = new Box();
        a.setdemo(2, 2, 2);
        a.TiJi();

    }
}
