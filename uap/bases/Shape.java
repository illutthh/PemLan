package uap.bases;

import uap.interfaces.*;

public abstract class Shape implements ShippingCostCalculator, MassConverter { 
    private String name; //atribut yang dimiliki dari class Shape

    public Shape(String name) { //parameter berisi nama bentuk
        this.name = name;
    }

    public void setName(String name) { //set nama yang akan digunakan
        this.name = name;
    }

    public String getName() {// get nama yang telah di set
        return name;
    }

    public abstract void printInfo(); //abstract dari method printInfo
    
}
