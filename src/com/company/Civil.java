package com.company;

public class Civil extends Air{
    private int passengers;
    private boolean businessClass;

    public Civil (double hp, double maxSpeed, double weight, String name,
                  double wingspan, double runwayLength, int passengers, boolean businessClass)
    {

        super(hp, maxSpeed ,weight ,name, wingspan, runwayLength);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public int getPassengers() {
        return passengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void display () {

        System.out.println("HP: " + getHP() + " HP; Max speed: " + getMaxSpeed() + " km/h; Weight: " +
                getWeight() + " t; Name: " + getName() + "; Wingspan: " + getWingspan() + " m; Runway length: " +
                getRunwayLength() + " km; " + "Passengers: " + getPassengers() +
                "; Business class: " + isBusinessClass() + "; Power: " + getPower() + " kVt.");


    }

}
