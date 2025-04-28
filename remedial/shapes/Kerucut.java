package remedial.shapes;

import remedial.bases.BangunRuang;
import remedial.intefaces.MemilikiBerat;
import remedial.intefaces.MemilikiGarisPelukis;
import remedial.intefaces.MemilikiPrintInfo;
import remedial.intefaces.MemilikiVolume;

public class Kerucut extends BangunRuang implements MemilikiBerat, MemilikiVolume, MemilikiGarisPelukis, MemilikiPrintInfo { // class kerucut yang di inheritance dengan bangun ruang dan di implements dengan M.volume, M.berat dan M.printifo

    private double radius;
    private final int PI_PEMBILANG = 22; //deklar pi pembilang dengan nilai int dan bersifat private, nilai pi pembilang final 
    private final int PI_PENYEBUT = 7; //deklar pi penyebut dengan nilai int dan bersifat private, nilai pi penyebut final

    public Kerucut(String nama, double tinggi, double massa, double radius) { //konstruktor dengan argumen string doble double double
        super(nama, tinggi, massa); //agar inheritance bisa diakses maka dibuatkan super yang dimana knstruktor berisi nama, tinggi, dan massa
        this.radius = radius; //mengisi atribut dari radius dengan parameter radius
    }

    @Override
    public double hitungVolume() { //override dari hitung volume berasal dari kelas MemilikiVolume
        return (1.0/3.0) * ((double) PI_PEMBILANG / PI_PENYEBUT) * Math.pow(radius, 2) * getTinggi();
    }

    @Override
    public double hitungGarisPelukis() { //override dari hitung garis pelukis berasal dari kela MemilikiGarisPelukis
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(getTinggi(), 2));
    }

    @Override
    public double hitungBerat() { //override dari hitung berat berasal dari kelas MemilikiBerat
        return getMassa() * g;
    }

    @Override
    public void printinfo() { //override dari print info berasala dari kelas MemilikiPrintInfo
        System.out.printf("%-16s: %s%n", "Nama", getNama());
        System.out.printf("%-16s: %.2f%n", "Volume", hitungVolume());
        System.out.printf("%-16s: %.2f%n", "Berat", hitungBerat());
        System.out.printf("%-16s: %.2f%n", "Garis Pelukis", hitungGarisPelukis());
    }
}
