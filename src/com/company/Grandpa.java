package com.company;

public class Grandpa extends Person implements AnimalLover{
    Grandpa(String name, int age) {
        super(name, age);
    }

    @Override
    public void doing() {
        System.out.println("дедушка"+" "+name+" "+age+" лет ухаживает за питомцами.");
       }

    @Override
    public void walks() {
        System.out.println("Дедушка гуляет с собакой на улице, с котом и рыбкой дома.");
    }
}
