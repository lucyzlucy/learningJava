package schildt;

import java.sql.SQLOutput;

interface IVehicle {
    int range();
    double fuelneeded(int miles);

    // Accessor methods
    int getPassengers();

    void setPassengers(int p);

    int getFuelcap();

    void setFuelcap(int f);

    int getMpf();

    void setMpg(int m);

    int getCargo();

    void putCargo(int c);
}

public class TruckDemo {
    public static void main(String[] args) {
        // construct some trucks
        var semi = new Truck (2, 200, 7, 44000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.");


    }
}

abstract class Vehicle implements IVehicle{
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int a, int b, int c) {
        passengers = a;
        fuelcap = b;
        mpg = c;
    }

    public int range() {
        return mpg * fuelcap;
    }

    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Accessor methods
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        passengers = p;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int f) {
        fuelcap = f;
    }

    public int getMpf() {
        return mpg;
    }

    public void setMpg(int m) {
        mpg = m;
    }

}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    public int getCargo() {
        return cargocap;
    }

    public void putCargo(int c) {
        cargocap = c;
    }
}

