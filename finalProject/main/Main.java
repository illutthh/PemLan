package finalProject.main;

import java.util.*;
import finalProject.jenis.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cafe cafe = new Cafe();

        // Inisialisasi menu hanya sekali
        cafe.addMakanan(new Makanan("Nasi Goreng", "Pedas", 10000));
        cafe.addMakanan(new Makanan("Mie Goreng", "Mie goreng pedas dengan sayur", 13000));
        cafe.addMakanan(new Makanan("Gado-Gado", "Sayuran dengan bumbu kacang", 12000));

        cafe.addMinuman(new Minuman("Teh Manis", "Dingin", 5000));
        cafe.addMinuman(new Minuman("Kopi Hitam", "Pahit", 6000));
        cafe.addMinuman(new Minuman("Jus Jeruk", "Segar", 7000));

        String garis = "==================================";
        System.out.println(garis);
        System.out.println("Selamat Datang Di Cafe Berbagi");
        System.out.println(garis);

        System.out.print("Hai!! dengan siapa ni : ");
        String nama = in.nextLine();

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n" + garis);
            System.out.println("Menu Utama");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilihan kamu: ");
            int pilihan = in.nextInt();
            in.nextLine(); // flush newline

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Makanan:");
                    for (int i = 0; i < cafe.getDaftarMakanan().size(); i++) {
                        System.out.println((i + 1) + ". " + cafe.getDaftarMakanan().get(i).getNama());
                    }

                    System.out.print("Pilih makanan (1-" + cafe.getDaftarMakanan().size() + "): ");
                    int pilihMakanan = in.nextInt();
                    in.nextLine();

                    if (pilihMakanan >= 1 && pilihMakanan <= cafe.getDaftarMakanan().size()) {
                        Makanan makanan = cafe.getDaftarMakanan().get(pilihMakanan - 1);
                        System.out.println("Sedang menyiapkan makanan...");
                        Makanan.countdownTimer(3);
                        System.out.println("\n" + makanan.Infomakanan());
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Minuman:");
                    for (int i = 0; i < cafe.getDaftarMinuman().size(); i++) {
                        System.out.println((i + 1) + ". " + cafe.getDaftarMinuman().get(i).getNama());
                    }

                    System.out.print("Pilih minuman (1-" + cafe.getDaftarMinuman().size() + "): ");
                    int pilihMinuman = in.nextInt();
                    in.nextLine();

                    if (pilihMinuman >= 1 && pilihMinuman <= cafe.getDaftarMinuman().size()) {
                        Minuman minuman = cafe.getDaftarMinuman().get(pilihMinuman - 1);
                        System.out.println("Sedang menyiapkan minuman...");
                        Minuman.countdownTimer(3);
                        System.out.println("\n" + minuman.Infominuman());
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                case 3:
                    lanjut = false;
                    System.out.println("\nTerima kasih telah datang, " + nama + "!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }

        in.close();
    }
}
