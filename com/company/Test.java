package com.company;

class Animal {
    public String name;
    public int month;
    public String species;


    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }
    public String getSpecies(){
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSpecies(String species) {
        this.species = species;
    }


    public void setMonth(int month) {
        this.month = month;
    }



    public void eat() {
        System.out.println(this.getName()+"正在吃东西");
    }
}

class cat extends Animal {
    private double weight;
    cat(){}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void run(){
        System.out.println(this.getName()+"是一只"+getSpecies()+"的猫"+"它重"+this.weight+"他在跑");
    }
}
public class Test{
    public static void main(String[] args){
        cat npcy=new cat();
        npcy.setName("冯軒");
        npcy.setSpecies("中华好猫");
        npcy.setWeight(34);
        npcy.run();
        npcy.eat();
    }

}

