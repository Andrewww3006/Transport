package com.company;

public class Passenger extends Ground{
    private String bodyType;
    private int passengers;

    public Passenger (double hp, double maxSpeed, double weight, String name,
                      int wheels, double consumption, String bodyType, int passengers)
    {

        super(hp, maxSpeed ,weight ,name, wheels, consumption);
        this.bodyType = bodyType;
        this.passengers = passengers;

    }

    public void display () {

        System.out.println("HP: " + getHP() + " HP; Max speed: " + getMaxSpeed() + " km/h; Weight: " +

               getWeight() + " t; Name: " + getName() + "; Wheels: " + getWheels() + "; Consumption: " +

                getConsumption() + " l/100 km; " + "Body type: " + bodyType + "; Passengers: " + passengers +

                "; Power: " + getPower() + " kVt.");


    }

}
