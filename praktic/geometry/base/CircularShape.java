package praktic.geometry.base;

public abstract class CircularShape extends Shape { //pemanggilan class Shape melalui cara inheritance, extends

    private double radius; //deklarasi atribut radius yang bersifat private

    protected int PI_NUMERARTOR = 22; //deklarasi numerartor yang bersifat protected
    protected int PI_DENOMINATOR = 7; //deklarasi denominator yang bersifat protected

    public CircularShape() {} //pemanggilan konstruktor overlaod non arguments

    public void setRadius(double inputRadius) { //deklar utk mengset nilai radius
        this.radius = inputRadius;
    }

    public double getRadius() { //deklar untuk mengambil nilai yang sudah di set tdi
        return radius;
    }
}
