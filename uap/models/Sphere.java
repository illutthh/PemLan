package uap.models;

import uap.interfaces.*;
import uap.bases.*;

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, ShippingCostCalculator, MassConverter { //class dengan implementasi interface dan extends 
    private double radius; //atribut yang ada pada class Sphere

    public Sphere () { //konstruktor default
        super("Donat Tanpa Lubang");
        this.radius = 0.0;
    }
    public Sphere(double radius) { //konstruktor dengan parameter
        super("Donat Tanpa Lubang");
        this.radius = radius;
    }

    @Override
    public double getVolume() { //overide dari interface ThreeDimensional dengan rumus volume
        return (4.0/3.0) * Pi * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() { //overide dari interface ThreeDimensional dengan rumus luas permukaan
        return 4 * Pi * Math.pow(radius, 2);
    }

    @Override
    public double getMass() { //overide dari interface MassCalculable dengan rumus massa
        return getVolume() * Density * Thickness;
    }

    @Override
    public double GramToKg() { //overide dari interface MassConverter dengan rumus konversi gram to kg
        return getMass() / dominator;
    }

    @Override
    public double calculateCost() { //overide dari interface ShippingCostCalculator dengan rumus biaya pengiriman
        return GramToKg() * Price_Per_Kg;
    }

    @Override
    public void printInfo() { //overide dari interface PrintInfo dengan print info
        System.out.printf("Volume: %.2f\n", getVolume());
        System.out.printf("Luas Permukaan: %.2f\n", getSurfaceArea());
        System.out.printf("Massa: %.2f \n", getMass());
        System.out.printf("Massa dalam kilogram: %.2f \n", GramToKg());
    }
}
