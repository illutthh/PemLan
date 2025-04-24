package praktic.geometry.shapes;

import praktic.geometry.base.Shape;
import praktic.geometry.interfaces.Weightable;
import praktic.geometry.interfaces.ThreeDimensional;

public class Cube extends Shape implements ThreeDimensional, Weightable { //class cube yang di inheritance dengan class shape implement interfaces three demensional dan weightable
    private double edge, mass; // deklar atribut bernilai double yaitu edge dan mass

    public Cube(double edge, double mass) { //deklar konstruktor argument double, double
        super(); //agar bisa mengakses methode nama dari class shape maka dibuatkan super();
        setNama("Cube");
        this.edge = edge;
        this.mass = mass;
    }

    @Override
    public double getSurfaceArea() { //overide dari three demensional dengan tujuan untk melakukan penyelesaian surafce area dengan rumus yang telah dituliskan pada return
        return 6 * Math.pow(edge, 2);
    }

    @Override
    public double getVolume() { //overide dari three demensional dengan tujuan untk melakukan penyelesaian volume dengan rumus yang telah dituliskan pada return
        return Math.pow(edge, 3);
    }

    @Override
    public double getWeight() { //overide dari weightable yang sblm nya di implementkan pada class cube, berguna utk menyelesaikan permaslaha dengan menggunakan rumus yg ada 
        return getVolume() * mass * g;
    }

    @Override
    public void printInfo() { //overide dari shape yg sblmnya di extendes, dimana methode ini menampilkan info

        System.out.printf("%-16s: %s%n%-16s: %.2f%n%-16s: %.2f%n%-16s: %.2f%n",
            "Nama", getNama(), 
            "Luas permukaan", getSurfaceArea(),
            "Volume", getVolume(),
            "Berat", getWeight());
    }
}
