package ru.mirea;

public class Alabai extends Dog {
    private float weight;
    private float height;
    public Alabai(String name,float weight,float height){
        super(name);
        this.height=height;
        this.weight=weight;
    }

    public void display(){
        System.out.printf("Dog Name: %s \n weight: %s \n height: %s \n ", super.getName(), weight,height);

    };
}