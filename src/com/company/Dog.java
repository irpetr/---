package com.company;

public class Dog implements Pet,AnimalLover {
    String nickname;
    String breed;

    Dog(String nikname, String breed) {
        this.nickname = nikname;
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(breed + " " + nickname + " кушает мясо.");
    }

    @Override
    public void makeSound() {
        System.out.println(breed + " " + "гавкает.");
    }

    @Override
    public void walks() {
        System.out.println("Дедушка и "+breed+" гуляют в парке.");
    }
}

