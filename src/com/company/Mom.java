package com.company;

public class Mom extends Person implements Housewife{
    Mom(String name, int age) {
        super(name, age);
    }

    @Override
    public void doing() {
        System.out.println("мама"+" "+name+" "+age+" лет заботится о семье и доме.");
       }

    @Override
    public void shopping() {
        System.out.println("Мама ходит за продуктами.");
    }
    @Override
    public void cooks() {
        System.out.println("Мама готовит ужин.");
    }
}
