package finalProject.main;

import java.util.*;

import finalProject.interfaces.*;
import finalProject.jenis.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String garis = "==================================";
        
        System.out.println(garis);
        System.out.println("Selamat Datang Di Cafe Berbagi");
        System.out.println(garis);
        
        System.out.print("Hai!! dengan siapa ni : ");
        String nama = in.nextLine();
        boolean looping = true;
        
        do {
            System.out.println("\n" + garis);
            System.out.println("Menu Utama:");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilihan kamu: ");
            int pilihan = in.nextInt();
            in.nextLine(); // flush newline

            System.out.println(garis);

            switch (pilihan) {
                case 1:
                    List<String> menuMakanan = Arrays.asList(
                        "1. Nasi Goreng",
                        "2. Mie Goreng",
                        "3. Gado-Gado"
                    );
                    Menu.printMenu(menuMakanan);

                    System.out.print("Pilih makanan (1-3): ");
                    int pilihMakanan = in.nextInt();
                    in.nextLine();

                    InfoMakanan makanan = null;
                    switch (pilihMakanan) {
                        case 1:
                            makanan = new Makanan("Nasi Goreng", "Pedas", 10000);
                            break;
                        case 2:
                            makanan = new Makanan("Mie Goreng", "Mie goreng pedas dengan sayur", 13000);
                            break;
                        case 3:
                            makanan = new Makanan("Gado-Gado", "Sayuran dengan bumbu kacang", 12000);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            continue;
                    }

                    System.out.println("Sedang menyiapkan makanan...");
                    Menu.countdownTimer(3);
                    System.out.println("\n" + makanan.Infomakanan());
                    break;

                case 2:
                    List<String> menuMinuman = Arrays.asList(
                        "1. Teh Manis",
                        "2. Kopi Hitam",
                        "3. Jus Jeruk"
                    );
                    Menu.printMenu(menuMinuman);

                    System.out.print("Pilih minuman (1-3): ");
                    int pilihMinuman = in.nextInt();
                    in.nextLine();

                    InfoMinuman minuman = null;
                    switch (pilihMinuman) {
                        case 1:
                            minuman = new Minuman("Teh Manis", "Dingin", 5000);
                            break;
                        case 2:
                            minuman = new Minuman("Kopi Hitam", "Pahit dan panas", 8000);
                            break;
                        case 3:
                            minuman = new Minuman("Jus Jeruk", "Segar alami", 7000);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            continue;
                    }

                    System.out.println("Sedang menyiapkan minuman...");
                    Menu.countdownTimer(2);
                    System.out.println("\n" + minuman.Infominuman());
                    break;

                case 3:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }

        } while (looping);

        System.out.println("\nTerima kasih sudah memesan, " + nama + "!");
        System.out.println("Silakan datang kembali :)");
        in.close();
    }
}
