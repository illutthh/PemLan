package utp.shapes;

public class LimasPersegi extends BagunRuang {
    private double sisi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
        setNama("Limas Persegi");
    }

    public double getTinggiSegitiga() {
        return Math.sqrt((getTinggi() * getTinggi()) + ((sisi / 2) * (sisi / 2)));
    }

    public double getLuasSegitiga() {
        return 0.5 * sisi * getTinggiSegitiga();
    }

    public double getluasAlas() {
        return sisi * sisi;
    }

    public double getLuasPermukaan() {
        return 4 * getLuasSegitiga() + getluasAlas(); 
    }

    public double getVolume() {
        return getluasAlas() * (1.0 / 3.0) * getTinggi();
    }

}
