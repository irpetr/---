package com.company;

public class Cat implements Pet,AnimalLover{
    String nickname;
    String breed;
    Cat(String niсkname, String breed) {
        this.nickname = niсkname;
        this.breed = breed;
    }
        public void eat() {
            System.out.println(breed+" "+nickname+" кушает рыбу.");
        }

    @Override
    public void makeSound() {
        System.out.println(breed+" "+"мяукает.");

    }
    @Override
    public void walks() {
        System.out.println("Дедушка и "+breed+" гуляют дома.");
    }
}
