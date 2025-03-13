package praktic.geometry.Shapes;

public class Rectangle {
    static String WHITE = "\u001B[37m";
    private int ID;
    private double Panjang;
    private double Lebar;
    

    public Rectangle(int ID, double panjang, double lebar) {
        this.ID = ID;
        this.Panjang = panjang;
        this.Lebar = lebar;
    }
    public int GetID() {
        return ID;
    }
    public double GetPanjang() {
        return Panjang;
    }
    public double GetLebar(){
        return Lebar;
    }
    public double GetKeliling(){
        return 2 * (Panjang + Lebar);//menggunakan rumus keliling persegi panjang
    }
    public double GetLuas(){
        return Panjang * Lebar;//mengguankan rumus luas persegi panjang
    }
    public void PrintDeskirpsi(){
        System.out.println(WHITE+"ID : " + ID);
        System.out.println(WHITE+"Panjang : " + Panjang);
        System.out.println(WHITE+"Lebar : " + Lebar);
        System.out.println(WHITE+"Keliling : " + GetKeliling());
        System.out.println(WHITE+"Luas : "  + GetLuas());
    }
}
