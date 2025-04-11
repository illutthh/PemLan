package utp.shapes;

public abstract class BagunRuang {
    private String nama;
    private double tinggi;

    public BagunRuang() {
        this.nama = nama;
        this.tinggi = tinggi;
    }
    
    public void setNama(String input){
        this.nama = input;
    }

    public String getNama(){
        return this.nama;
    }

    public void setTinggi(double input){
        this.tinggi = input;
    }

    public double getTinggi(){
        return this.tinggi;
    }

    abstract double getLuasPermukaan();
        
    abstract double getVolume();

    public void printInfo() {
        System.out.println("Nama Bangun Ruang: " + getNama());
        System.out.println("Tinggi: " + getTinggi());
        System.out.println("Luas Permukaan: " + getLuasPermukaan());
        System.out.println("Volume: " + getVolume());
    }
}
