package com.company;

public class Ground extends Transport{
    private int wheels;
    public double consumption;

    public Ground(double hp, double maxSpeed, double weight, String name, int wheels, double consumption)
    {
        super(hp, maxSpeed, weight, name);
        this.wheels = wheels;
        this.consumption = consumption;

    }

    public int getWheels()
    {
        return wheels;
    }

    public double getConsumption()
    {
        return consumption;
    }

    @Override
    public void display() {

    }
}
