package com.company;

public class Truck extends Ground{
    public double lifting;

    public Truck (double power, double maxSpeed, double weight, String name,
                      int wheels, double consumption, double lifting)
    {

        super(power, maxSpeed ,weight ,name, wheels, consumption);
        this.lifting = lifting;


    }

}
