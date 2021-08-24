package com.company;

public abstract class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void loveFamily(){
        System.out.println(this.name+" "+ "любит свою семью.");
    }
    public abstract void doing();
}
