package com.company;

public class Truck extends Ground{
    public double lifting;

    public Truck (double hp, double maxSpeed, double weight, String name,
                      int wheels, double consumption, double lifting)
    {

        super(hp, maxSpeed ,weight ,name, wheels, consumption);
        this.lifting = lifting;


    }

    public void display () {

        System.out.println("HP: " + getHP() + " HP; Max speed: " + getMaxSpeed() + " km/h; Weight: " +

                getWeight() + " t; Name: " + getName() + "; Wheels: " + getWheels() + "; Consumption: " +

                getConsumption() + " l/100 km; " + "Lifting: " + lifting + "t ; "+

                "; Power: " + getPower() + " kVt.");


    }



}
