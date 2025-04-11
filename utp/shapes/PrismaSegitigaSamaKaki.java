package utp.shapes;

public class PrismaSegitigaSamaKaki extends BagunRuang {
    private double alas;
    private double kaki;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        setTinggi(tinggi);
        setNama("Prisma Segitiga Sama Kaki");
    }

    public double getTinggiSegitiga() {
        return Math.sqrt((kaki * kaki) - ((alas / 2) * (alas / 2)));
    }

    public double getLuasAlas() {
        return 0.5 * alas * getTinggiSegitiga();
    }

    public double getKeliling() {
        return alas + 2 * kaki;
    }

    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }
}
