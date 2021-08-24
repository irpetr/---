package com.company;

public class Fish implements Pet,AnimalLover{
    String nickname;
    String breed;
    Fish(String niсkname, String breed) {
        this.nickname = niсkname;
        this.breed = breed;
    }
    @Override
    public void eat() {
        System.out.println(breed+" "+nickname+" кушает корм.");
    }

    @Override
    public void makeSound() {
        System.out.println(breed+" "+"молчит.");

    }


    @Override
    public void walks() {
        System.out.println("Дедушка и "+breed+" гуляют дома.");
    }
}
