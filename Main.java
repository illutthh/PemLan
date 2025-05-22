
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String garis = "-----------------------------------------";


        try {
            Scanner in = new Scanner(System.in);
            System.out.println(garis);
            String teks = "Ini adalah Tugas"; //String sumber akan diminta menjadi patokan dalam index
            System.out.println(teks); //menampilkan teks yang akan dijadikan patokan
            System.out.println(garis); //menampilkan garis untuk memisahkan antara input dan
            System.out.print("Masukan angka untuk mencari char pada teks (0-15): "); //user diminta utk memasukan angka utk mencari char
            int index = in.nextInt(); // Index yang akan dicari dari teks, namun pada teks hanya berjumlah 0-15 char

            if (index >= teks.length()) { //penggunaan if untuk memastikan index tidak melebihi panjang string
                throw new StringIndexOutOfBoundsException("Index " + index + " diluar batas " + teks.length()); //jika melebihi maka akan mengeluarkan error dengan pesan yang telah ditentukan
            } else {
                char a = teks.charAt(index); //else nya berupa penggunaan charAt() untuk mengambil karakter pada index yang telah ditentukan misal kan 8 untuk menapilkan huruf "a"
                System.out.println("Karakter ke-" + index + " adalah " + a); //output yang akan menampilkan pesan dari else
            }

        } catch (StringIndexOutOfBoundsException e) { // catch untuk menangkap error yang telah ditentukan, karna disini menggunakan StringIndexOutOfBoundsException yang dimana string itu melebihi batas
            System.out.println(e.getMessage()); // untuk menampilkan error nya karna apa, dsni menggunakan string StringIndexOutOfBoundsException
        } //kegunaan code ini kita mengetahui index/char dari teks "ini adalah tugas" dengan menggunakan StringIndexOutOfBoundsException
    }
}
