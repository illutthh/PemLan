package remedial.mains;

import java.util.Scanner;

import remedial.bases.BangunRuang;
import remedial.shapes.Balok;
import remedial.shapes.Kerucut;

public class KalkulatorBangunRuangMini  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         boolean lanjut = true;

        String garis = "======================================"; ////pengibaratkan output berupa garis dengan variable bernama garis

        System.out.println(garis); //output akan menampilkan garis yg dibaratkan dgn variable garis tadi
        System.out.println("Kalkulator Bangun Ruang Mini Versi B");
        System.out.print("Nama Lengkap : ");
        String nama = in.nextLine(); //utk menginput nama yag bertipe string
        System.out.print("NIM : ");
        double nim = in.nextDouble(); //utk menginput nim    yag bertipe double
        System.out.println(garis);
        
        do { //membuat menu yang looping trs menerus hingga user memilih 3
            System.out.println("Pilihan : \n 1. Kerucut \n 2. Balok \n 3. Keluar");//menu yang tersedia, dan memilih sesuai angka menu
            System.out.println(garis);
            System.out.print("Pilihan Anda : ");//user diminta utk menginput pilihan menu
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1: //jika user memilih 1
                    System.out.println("Kerucut");
                    System.out.println(garis); //menampilkan garis

                    System.out.print("Isikan Nama : "); //pengguna diminta utk meng input nama
                    in.nextLine();
                    String namaKerucut = in.nextLine();
                    
                    System.out.print("Isikan Radius : "); //pengguna diminta utk menginput radius
                    double setRadius = in.nextDouble();
                    
                    System.out.print("Isikan tinggi : "); //pengguna diminta utk menginput tinggi
                    double setTinggiKerucut = in.nextDouble();
                    
                    System.out.print("Isikan massa : "); //pengguna diminta utk menginput massa
                    double setMasssaKerucut = in.nextDouble();

                    System.out.println(garis);

                    Kerucut kerucut = new Kerucut(namaKerucut, setTinggiKerucut, setMasssaKerucut, setRadius); //inisialisasi pada kerucut, yang dimana isi dari konstruktor berupa inputan yg disi oleh user
                    kerucut.printinfo(); //kerucut akan menampilkan info seputar volume dan massa
                    System.out.println(garis);
                    break;
                
                case 2: //jika user memilih 2
                    System.out.println("Balok");
                    System.out.println(garis);

                    System.out.print("Isikan Nama : ");
                    in.nextLine();
                    String namaBalok = in.nextLine();
                    
                    System.out.print("Isikan Panjang : "); //pengguna diminta utk menginput panjang
                    double setPanjang = in.nextDouble();
                    
                    System.out.print("Isikan lebar : "); //pengguna diminta utk menginput lebar
                    double setLebar = in.nextDouble();
                    
                    System.out.print("Isikan tinggi : "); //pengguna diminta utk menginput tinggi
                    double setTinggiBalok = in.nextDouble();
                    
                    System.out.print("Isikan massa : "); //pengguna diminta utk mengisikan massa
                    double setMasssaBalok = in.nextDouble();

                    System.out.println(garis);

                    Balok balok = new Balok(namaBalok, setTinggiBalok, setMasssaBalok, setPanjang, setLebar );
                    balok.printinfo(); //balok akan menampilkan info seputar volume dan massa
                    System.out.println(garis);
                break;

                case 3: //jika user memilih 3
                    System.out.println("Terimakasih, kalkulasi selesai"); //akan muncul output berupa ucapan terimasih, codngan selesai
                    System.exit(pilihan);
                default:
                    System.out.println("Pilihan Tidak valid. Silakan coba lagi"); //dimana outputini terjadi jika pengguna tidak menginput sesuai menu
                    System.out.println(garis);
                    break;
            }
        } while (lanjut); //looping akan trs berlanjut hingga pengguna memilih exit
    }
}
