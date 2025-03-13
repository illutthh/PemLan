package praktic.geometry.Shapes;

public class Circle {
    static String WHITE = "\u001B[37m";
    private int ID;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;
    
    public Circle() {
        this.ID = 0;
        this.radius = 0;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getKeliling(double radius){
        return (pembilang /(double) penyebut)*2*radius;//rumus keliling lingkaran dengan adanya double pembagian tidak bernilai 0
    }
    public double getLuas(double Luas){
        return  (pembilang/(double)penyebut)*radius*radius;//rumus luas lingkaran dengan adanya double pembagian tidak bernilai 0
    }
    public void deskripsi1(){
        System.out.println(WHITE+"ID : "+this.ID);
        System.out.println(WHITE+"Radius : "+this.radius);
        System.out.println(WHITE+"Keliling : "+ getKeliling(radius));
        System.out.println(WHITE+"Luas : " + getLuas(radius)) ;
    }
}
