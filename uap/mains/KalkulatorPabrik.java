package uap.mains;

import java.util.Scanner;

import uap.models.Sphere;
import uap.models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String garis = "======================================";

        System.out.println(garis);
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.print("NAMA LENGKAP\t: ");
        String nama = in.nextLine();
        System.out.print("NIM\t\t: ");
        double nim = in.nextDouble();
        System.out.println(garis);

        System.out.println("Donat dengan lubang");
        System.out.println(garis);
        System.out.print("Isikan Radius\t\t: ");
        double R = in.nextDouble();
        System.out.print("Isikan radius\t\t: ");
        double r = in.nextDouble();

        Torus torus = new Torus(R, r); //inisialisasi objek torus
        torus.setName("Donat dengan lubang");
        System.out.println("=============================================");
        torus.printInfo(); //torus memanggil method printInfo
        System.out.printf("Biaya Pengiriman: Rp%,.0f\n", torus.calculateCost());
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius\t\t: ");
        double radius = in.nextDouble();

        Sphere sphere = new Sphere(radius); //inisialisasi objek sphere
        sphere.setName("Donat Polos");
        System.out.println("=============================================");
        sphere.printInfo(); //sphare memanggil method printInfo
        System.out.printf("Biaya Pengiriman: Rp%,.0f\n",sphere.calculateCost());
        System.out.println("=============================================");
    }
}
