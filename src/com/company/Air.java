package com.company;

public class Air extends Transport{
    private double wingspan;
    private double runwayLength;

    public Air(double hp, double maxSpeed, double weight, String name, double wingspan, double runwayLength)
    {
        super(hp, maxSpeed, weight, name);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;

    }


    @Override
    public void display() {

    }

    public double getWingspan() {
        return wingspan;
    }

    public double getRunwayLength() {
        return runwayLength;
    }
}
