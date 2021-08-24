package com.company;

public class Sun extends Person implements Schoolboy{
    Sun(String name, int age) {
        super(name, age);
    }

    @Override
    public void doing() {
        System.out.println("сын"+" "+name+" "+age+" лет ходит в школу.");
        }

    @Override
    public void Learned() {
        System.out.println(name+" старается учиться хорошо.");
    }
}
