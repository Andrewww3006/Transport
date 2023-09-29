package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Transport bmw = new Passenger(125, 250, 1.5, "BMW", 4,
                15, "Sedan", 4);

        Transport scania = new Truck(1000, 150, 5, "Scania", 6,
                15, 15);

        Transport boing = new Civil(3000, 850, 15, "Boing", 85, 3,
                150, true);

        Transport stels = new Military(2000, 970, 2, "Stels", 15, 0.8,
                true, 8);

        bmw.display();
        scania.display();
        boing.display();
        stels.display();

    }
}
