package ru.mirea;

public abstract class Dog {
    private String name;
    public String getName(){return name;}
    public Dog(String name){
        this.name=name;

    }
    public abstract void display();
}