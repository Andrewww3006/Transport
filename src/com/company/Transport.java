package com.company;

public abstract class Transport {
    private double hp;
    private double maxSpeed;
    private double weight;
    private String name;


    public Transport(double hp, double maxSpeed, double weight, String name)
    {
        this.hp = hp;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.name = name;

    }

    public abstract void display();

    public  double  getHP()
    {
        return hp;
    }


    public double getMaxSpeed()
    {
        return maxSpeed;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return name;
    }

    public double getPower() {
        return hp*0.74;
    }
}
