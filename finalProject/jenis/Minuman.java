package finalProject.jenis;

import finalProject.interfaces.InfoMinuman;

public class Minuman extends Menu implements InfoMinuman {
    private double harga;
    private String deskripsi;

    public Minuman(String nama, String deskripsi, double harga) {
        super(nama);
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
    
    @Override
    public String Infominuman() {
        return "Nama Minuman: " + getNama() + " Harga: " + getHarga() + " Deskripsi: " + getDeskripsi();
    }
}
