package remedial.bases;

public abstract class BangunRuang  {
    private String nama; // deklar atribut nama bernilai string bertipe private
    private double tinggi, massa; // deklar atribut tinggi dan massa benrilai double bertipe private

    public BangunRuang(String nama, double tinggi, double massa) { //konstruktor argumen yang berisi string double massa, ini yang bakal di panngil kedalam super
        this.nama = nama; //mengisi atribut nama dgn parameter nama
        this.tinggi = tinggi; //mengisi atribu tinggi dgn parameter tinggi
        this.massa = massa; //mengisi atribut massa dgn parameter masssa
    }

    public String getNama() { //methode untung mengambil nama yang sudah dipanggil sblm nya
        return nama;
    }

    public double getTinggi() { //methode untung mengambil tinggi yang sudah dipanggil sblm nya
        return tinggi;
    }

    public double getMassa() { //methode untung mengambil massa yang sudah di panngil sblm nya
        return massa;
    }
}
