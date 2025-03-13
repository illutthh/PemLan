package praktic.geometry.Shapes;

public class Rectangle {
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
        return 2 * (Panjang + Lebar);
    }
    public double GetLuas(){
        return Panjang * Lebar;
    }
    public void PrintDeskirpsi(){
        System.out.println("ID : " + ID);
        System.out.println("Panjang : " + Panjang);
        System.out.println("Lebar : " + Lebar);
        System.out.println("Keliling : " + GetKeliling());
        System.out.println("Luas : "  + GetLuas());
    }
}
