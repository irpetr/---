package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Person father = new Father("Сергей", 42, true);
        Person mom = new Mom("Ира", 40);
        Person grandpa = new Grandpa("Вова", 56);
        Person sun = new Sun("Павел", 15);
        Person daughter = new Daughter("Арина", 5);
        father.loveFamily();
        father.doing();
        Doctor doctor = new Father("Сергей", 42, true);
        doctor.heals();
        Husband husband = new Father("Сергей", 42, true);
        husband.educate();
        mom.loveFamily();
        mom.doing();
        Housewife housewife = new Mom("Ира", 40);
        housewife.shopping();
        housewife.cooks();
        grandpa.loveFamily();
        grandpa.doing();
        AnimalLover animalLover = new Grandpa("Вова", 56);
        animalLover.walks();
        sun.loveFamily();
        sun.doing();
        Schoolboy schoolboy = new Sun("Павел", 15);
        schoolboy.Learned();
        daughter.loveFamily();
        daughter.doing();
        Child child = new Daughter("Арина", 5);
        child.rides();
        Dog dog = new Dog("Bella", "Такса");
        Cat cat = new Cat("Tom", "Мейн-кун");
        Fish fish = new Fish("Sally", "Гуппи");
        dog.eat();
        cat.eat();
        fish.eat();
        dog.walks();
        cat.walks();
        fish.walks();
    }
}
