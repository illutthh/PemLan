    package uap.models;

    import uap.bases.*;
    import uap.interfaces.*;

    public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {//class dengan implementasi interface dan extends
        private double majorRadius; //atribut yang ada pada kelas torus
        private double minorRadius;

        public Torus() { //parameter default
            super("Donat Berlubang");
            this.majorRadius = 0;
            this.minorRadius = 0;
        }

        public Torus(double majorRadius, double minorRadius) { //parameter dengan 2 konstruktor double, double
            super("Donat Berlubang"); 
            this.majorRadius = majorRadius;
            this.minorRadius = minorRadius;
        }
        
        @Override
        public double getVolume() { //overide dari interface ThreeDimensional dengan rumus volume
            return 2 * Pi * Pi * majorRadius * Math.pow(minorRadius, 2);
        }

        @Override
        public double  getSurfaceArea() { //overide dari interface ThreeDimensional dengan rumus luas permukaan
            return 4 * Pi * Pi * majorRadius * minorRadius;
        }

        @Override
        public double getMass() { //overide dari interface MassCalculable dengan rumus massa
            return getVolume() * Density * Thickness;
        }

        @Override
        public double calculateCost() { //overide dari interface ShippingCostCalculator dengan rumus biaya pengiriman
            return GramToKg() * Price_Per_Kg;
        }
        
        @Override 
        public double GramToKg() { //overide dari interface MassConverter dengan rumus konversi gram to kg
            return getMass() / dominator;
        }

        @Override
        public void printInfo() {//overide dari interface PrintInfo dengan print info
            System.out.printf("Volume: %.2f\n", getVolume());
            System.out.printf("Luas Permukaan: %.2f\n", getSurfaceArea());
            System.out.printf("Massa: %.2f \n", getMass());
            System.out.printf("Massa dalam kilogram: %.2f \n", GramToKg());
        }
    }
