package utp.mains;
import java.util.*;

import utp.shapes.LimasPersegi;
import utp.shapes.PrismaSegitigaSamaKaki;
import utp.shapes.Tabung;

/* 
luthfi ramdhan razzaq - 245150707111037

                                                       
                                                       
    //   ) )                                           
   //___/ /   ___     ___    ___       ___      ___    
  // ___ (   //   ) )    / /    / /   //   ) ) //   ) ) 
 //   | |  //   / /    / /    / /   //   / / ((___/ /  
//    | | ((___( (    / /__  / /__ ((___( (      ( (   


*/

public class Main {
    static String GREEN = "\u001B[32m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(GREEN+"=============================================");
        System.out.println(GREEN+"Kalkulator Bangun Ruang");
        System.out.print( GREEN+"Nama Lengkap : ");
        String nama = in.nextLine();
        System.out.print(GREEN+"NIM : ");
        int nim = in.nextInt();

        //Prisma Segitiga
        System.out.println(GREEN+"=============================================");
        System.out.println(GREEN+"Prisma Segitiga Sama Kaki");
        System.out.print(GREEN+"Isikan alas : ");
        double alas = in.nextDouble();
        System.out.print(GREEN+"Isikan kaki : ");
        double kaki = in.nextDouble();
        System.out.print(GREEN+"Isikan tinggi : ");
        double tinggi = in.nextDouble();
        
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggi);
        System.out.println(GREEN+"========================================");
        System.out.println(GREEN+"Nama          : " + prisma.getNama());
        System.out.println(GREEN+"Luas permukaan: " + prisma.getLuasPermukaan());
        System.out.println(GREEN+"Volume        : " + prisma.getVolume());

        //Limas Persegi
        System.out.println(GREEN+"=============================================");
        System.out.println(GREEN+"Limas Persegi");
        System.out.print(GREEN+"Isikan sisi : ");
        double sisi = in.nextDouble();
        System.out.print(GREEN+"Isikan tinggi : ");
        double tinggi2 = in.nextDouble();

        LimasPersegi limas = new LimasPersegi(sisi, tinggi2);
        System.out.println(GREEN+"========================================");
        System.out.println(GREEN+"Nama          : " + limas.getNama());
        System.out.println(GREEN+"Luas permukaan: " + limas.getLuasPermukaan());
        System.out.println(GREEN+"Volume        : " + limas.getVolume());

        //Tabung
        System.out.println(GREEN+"=============================================");
        System.out.println(GREEN+"Tabung");
        System.out.print(GREEN+"Isikan radius : ");
        double radius = in.nextDouble();
        System.out.print(GREEN+"Isikan tinggi : ");
        double tinggi3 = in.nextDouble();

        Tabung tabung = new Tabung();
        tabung.setRadius(radius);
        tabung.setTinggi(tinggi3);
        System.out.println(GREEN+"========================================");
        System.out.println(GREEN+"Nama          : " + tabung.getNama());
        System.out.println(GREEN+"Luas permukaan: " + tabung.getLuasPermukaan());
        System.out.println(GREEN+"Volume        : " + tabung.getVolume());
    }
}
