package praktic.geometry.shapes;

import praktic.geometry.base.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

public class Sphere extends CircularShape implements ThreeDimensional, Weightable { //class  yang di inheritance dengan class shape implement interfaces three demensional dan weightable
    private double mass; //deklar mass bernilar double bersifat private

    public Sphere(double radius, double mass) { //deklar konstruktor argument double, double
        super(); //agar bisa mengakses methode nama dari class shape maka dibuatkan super();
        setNama("Sphere");
        setRadius(radius);
        this.mass = mass;
    }

    @Override
    public double getSurfaceArea() { //overide dari three demensional dengan tujuan untk melakukan penyelesaian surafce area dengan rumus yang telah dituliskan pada return
        return 4 * ((double) PI_NUMERARTOR / PI_DENOMINATOR) * Math.pow(getRadius(), 2);
    }

    @Override
    public double getVolume() { //overide dari three demensional dengan tujuan untk melakukan penyelesaian volume dengan rumus yang telah dituliskan pada return
        return (4.0 / 3.0) * ((double) PI_NUMERARTOR/ PI_DENOMINATOR) * Math.pow(getRadius(), 3);
    }

    @Override
    public double getWeight() { //overide dari weightable yang sblm nya di implementkan pada class cube, berguna utk menyelesaikan permaslaha dengan menggunakan rumus yg ada
        return getVolume() * mass * g;
    }

    @Override
    public void printInfo() { //overide dari shape yg sblmnya di extendes, dimana methode ini menampilkan info
        System.out.printf("%-16s: %s%n%-16s: %.2f%n%-16s: %.2f%n%-16s: %.2f%n",
            "Name", getNama(),
            "Surface Area", getSurfaceArea(),
            "Volume", getVolume(),
            "Weight", getWeight());
    }
}
