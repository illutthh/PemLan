package utp.shapes;

public class Tabung extends BagunRuang {

    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;

    public Tabung() {
        setNama("Tabung");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    private double getPhi() {
        return (double) pembilang / penyebut;
    }

    public double getLuasAlas() {
        return getPhi() * radius * radius;
    }

    public double getKeliling() {
        return 2 * getPhi() * radius;
    }

    @Override
    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }
}