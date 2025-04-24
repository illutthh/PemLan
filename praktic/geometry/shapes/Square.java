package praktic.geometry.shapes;

import praktic.geometry.base.Shape;
import praktic.geometry.interfaces.TwoDemensional;

public class Square extends Shape implements TwoDemensional { //membuat class square yng di inheritence kan ke shape dan di implements interfaces degan two demensional
    private double side; //deklar atribut side yang bernilai double bersifat private

    public Square() {}

    public Square(double side) { //deklar konstruktor argumen double
        super();//agar bisa mengakses inheritence circular shape yaitu berupa method nama
        setNama("Square");
        this.side = side;
    }

    public double getArea() { //deklar methode yang berguna utk mencari area, rumus pada return, ini override
        return Math.pow(side, 2);   
    }

    public double getPerimeter() { //deklar methode yang berguna utk mencari area, rumus pada return, ini override
        return 4 * side;
    }

    public void printInfo() { //methode menampilkan info, ini override dari shape
        
            System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n",
            "Nama", getNama(), 
            "Luas permukaan",getArea(),
            "Keliling", getPerimeter());
    }
}
