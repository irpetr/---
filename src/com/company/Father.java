package com.company;

public class Father extends Person implements Husband,Doctor{
    boolean isKind=true;
    Father(String name, int age, boolean isKind) {
        super(name, age);
        this.isKind=isKind;
    }
    @Override
    public void doing() {
        System.out.println("папа"+" "+name+" "+age+" года ходит на работу.");
       }
    @Override
    public void educate() {
        System.out.println("Помогает маме воспитывать детей.");
    }

    @Override
    public void heals() {
        System.out.println("Папа лечит людей.");
    }
}
