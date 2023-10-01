package com.company;

public class Military extends Air{
    private boolean ejection;
    private int rockets;

    public Military (double hp, double maxSpeed, double weight, String name,
                  double wingspan, double runwayLength, boolean ejection, int rockets)
    {
        super(hp, maxSpeed ,weight ,name, wingspan, runwayLength);
        this.ejection = ejection;
        this.rockets = rockets;
    }

    public boolean isEjection() {
        return ejection;
    }

    public int getRockets() {
        return rockets;
    }

    public void display() {
        System.out.println("HP: " + getHP() + " HP; Max speed: " + getMaxSpeed() + " km/h; Weight: " +
                getWeight() + " t; Name: " + getName() + "; Wingspan: " + getWingspan() + " m; Runway length: " +
                getRunwayLength() + " km; " + "Ejection: " + isEjection() +
                "; Rockets: " + getRockets() + "; Power: " + getPower() + " kVt.");
    }

    public void fire ()
    {
        for (int i = this.getRockets();i >= 0; i--)
        {
            if (i!=0)
                System.out.println("Ракета   пошла");
            else System.out.println("Боеприпасы отсутствуют");
        }
    }
    public void testEjection()
    {
        if(this.isEjection())
            System.out.println("Катапультирование прошло успешно");
        else System.out.println("У вас нет такой системы");
    }
}
