package finalProject.jenis;

import java.util.*;

public class Cafe {
    private List <Makanan> daftarMakanan = new ArrayList<>();
    private List <Minuman> daftarMinuman = new ArrayList<>();

    public void addMakanan(Makanan makanan) {
        daftarMakanan.add(makanan);
    }

    public void addMinuman(Minuman minuman) {
        daftarMinuman.add(minuman);
    }

    public List <Makanan> getDaftarMakanan() {
        return daftarMakanan;
    }

    public List <Minuman> getDaftarMinuman() {
        return daftarMinuman;
    }
}
