package com.company;

public class Transport {
    private double power;
    private double maxSpeed;
    private double weight;
    private String name;


    public Transport(double power, double maxSpeed, double weight, String name)
    {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.name = name;

    }

    public double getPower()
    {
        return power;
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




}
