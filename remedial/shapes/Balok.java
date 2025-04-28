package remedial.shapes;

import remedial.bases.BangunRuang;
import remedial.intefaces.MemilikiBerat;
import remedial.intefaces.MemilikiPrintInfo;
import remedial.intefaces.MemilikiVolume;

public class Balok extends BangunRuang implements MemilikiVolume, MemilikiBerat, MemilikiPrintInfo { // class balok yang di inheritance dengan bangun ruang dan di implements dengan M.volume, M.berat dan M.printifo
    private double panjang, lebar; //deklar atribut panjang dan lebar yang memiliki nilai duoble bersifat private

    public Balok(String nama, double tinggi, double massa, double panjang, double lebar ) { //konstruktor ber argumen string, tinggi, massa, panjang, lebar
        super(nama, tinggi, massa); //agar inheritance bisa diakses maka dibuatkan super yang dimana knstruktor berisi nama, tinggi, dan massa
        this.lebar = lebar; //mengisi atribut lebar dgn parameter lebar
        this.panjang = panjang; // mengisi atribut panjang dgn parameter panjang
    }

    @Override
    public double hitungVolume() { //override dari hitung volume berasal dari kelas MemilikiVolume
        return panjang * lebar * getTinggi(); //rumus volume balok
    }

    @Override
    public double hitungBerat() { //override dari hitung berat berasal dari kelas MemilikiBerat
        return getMassa() * g; //rumus mencari massa
    }

    @Override
    public void printinfo() { //override dari print info berasala dari kelas MemilikiPrintInfo
        System.out.printf("%-16s: %s%n", "Nama", getNama());
        System.out.printf( "%-16s: %.2f%n","Volume", hitungVolume());
        System.out.printf("%-16s: %.2f%n", "Berat", hitungBerat());
    }    
}
