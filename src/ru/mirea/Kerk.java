package ru.mirea;
public class Kerk extends Dog {
    private float weight;
    private float height;
    public Kerk (String name,float weight,float height){
        super(name);
        this.height=height;
        this.weight=weight;
    }

    public void display(){
        System.out.printf("Dog Name: %s \t weight: %s \n height: %s \n", super.getName(), weight,height);

    };
}