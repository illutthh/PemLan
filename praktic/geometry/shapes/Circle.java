package praktic.geometry.shapes;

import praktic.geometry.base.CircularShape;
import praktic.geometry.interfaces.TwoDemensional;

public class Circle extends CircularShape implements TwoDemensional { //membuat class cirlce yng di inheritence kan ke circular shape dan di implements interfaces degan two demensional
    
    public Circle() {} 

    public Circle(double radius) { //deklar konstruktor argument yaitu doouble
        super(); //agar bisa mengakses inheritence circular shape yaitu berupa method nama dan radius
        setNama("Circle");
        setRadius(radius);
    }

    @Override
    public double getArea() { //deklar methode get area yg berisikan rumus dari area, ini merupakan overide dari two demensional
        return ((double)PI_NUMERARTOR/PI_DENOMINATOR) * Math.pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() { //deklar methode get perimter yg berisikan rumus dari perimeter itu sendiri
        return 2 * ((double)PI_NUMERARTOR/PI_DENOMINATOR) * getRadius();
    }

    @Override
    public void printInfo() { //methode overide dari circular shape yang di inheritence dari shape
        
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n", //output untuk menampilkan info dengan bentuk format
        "Nama", getNama(), 
        "Luas permukaan",getArea(),
        "Keliling", getPerimeter());
    }
}
