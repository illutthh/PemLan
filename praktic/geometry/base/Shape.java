package praktic.geometry.base;

public abstract class Shape {
    private String nama; //deklar atribut nama yang bersifat private

    public Shape() {} //deklar konstruktor non arguments

    public void setNama(String inputNama) { //deklar methode set nama utk memberikan nilai nama
        this.nama = inputNama;
    }

    public String getNama() { //deklar methode get utk mengambil nilai nama yang sudah di set sblmnya
        return nama;
    }

    public abstract void printInfo();  //deklar methode printinfo yg abstract, nanti bakal digunakan untuk overiding nanti
}
