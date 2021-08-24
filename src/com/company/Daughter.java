package com.company;

public class Daughter extends Person implements Child{
    Daughter(String name, int age) {
        super(name, age);
    }

    @Override
    public void doing() {
        System.out.println("дочка"+" "+name+" "+age+" лет ходит в садик.");
        }

    @Override
    public void rides() {
        System.out.println(name+" любит кататься на роликах и велосипеде.");
    }
}
