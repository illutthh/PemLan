package praktic.geometry.mains;

import java.util.Scanner;

import praktic.geometry.base.CircularShape;
import praktic.geometry.base.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.TwoDemensional;
import praktic.geometry.interfaces.Weightable;
import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Cube;
import praktic.geometry.shapes.Sphere;
import praktic.geometry.shapes.Square;

/* 
luthfi ramdhan razzaq - 245150707111037

                                                       
                                                       
    //   ) )                                           
   //___/ /   ___     ___    ___       ___      ___    
  // ___ (   //   ) )    / /    / /   //   ) ) //   ) ) 
 //   | |  //   / /    / /    / /   //   / / ((___/ /  
//    | | ((___( (    / /__  / /__ ((___( (      ( (   


*/

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //berguna utk menginputpada nilai pengguna

        String reset = "\u001B[0m"; //pengibaratkan kode warna reset dengan variable bernama reset, warna menjadi normal = putih
        String hijau = "\u001B[32m"; //pengibaratkan kode warna hijau dengan variable bernama hijau

        String garis = hijau + "======================================" + reset; ////pengibaratkan output berupa garis dengan variable bernama garis

        System.out.println(garis); //output akan menampilkan garis yg dibaratkan dgn variable garis tadi
        System.out.println("Shape Calculator");
        System.out.print("Nama Lengkap : ");
        String nama = in.nextLine(); //utk menginput nama yag bertipe string
        System.out.print("NIM : ");
        double nim = in.nextDouble(); //utk menginput nim    yag bertipe double
        System.out.println(garis);

        System.out.println("2D Circle");
        System.out.println(garis);
        
        System.out.print("Enter Radius : ");
        double setRadiusLingkaran = in.nextDouble(); //menginput nilai radius

        CircularShape lingakran = new Circle(setRadiusLingkaran); // Inisialisasi objek Circle menggunakan konstruktor berparameter (double radius) Objek diakses melalui referensi interface CircularShape (polymorphism)
        System.out.println(garis);
        lingakran.printInfo(); // menampilkan info dari circle
        System.out.println(garis);

        System.out.println("2D Square");
        System.out.println(garis);

        System.out.print("Enter Side : ");
        double setSide = in.nextDouble();

        Shape persegi = new Square(setSide); // Inisialisasi objek square menggunakan konstruktor berparameter (double side) Objek diakses melalui referensi interface Shape (polymorphism)
        System.out.println(garis);
        persegi.printInfo(); //menampilkan info dari persegi
        System.out.println(garis);

        System.out.println("3D Weightable Cube");
        System.out.println(garis);

        System.out.print("Enter edge : ");
        double setEdgeCube = in.nextDouble();
        System.out.print("Enter mass : ");
        double setMassCube = in.nextDouble();

        Shape kubus = new Cube(setEdgeCube, setMassCube); // Inisialisasi objek Cube menggunakan konstruktor berparameter (double edge , double mass) Objek diakses melalui referensi interface Shape (polymorphism)
        System.out.println(garis);
        kubus.printInfo(); //menampilkan info dari kubus
        System.out.println(garis);

        System.out.println("3D Weightable Sphere");
        System.out.println(garis);

        System.out.print("Enter radius : ");
        double setRadiusSphere = in.nextDouble();
        System.out.print("Enter mass : ");
        double setMassSphere = in.nextDouble();

        CircularShape bola = new Sphere(setRadiusSphere, setMassSphere); /// Inisialisasi objek Sphare menggunakan konstruktor berparameter (double radius , double mass) Objek diakses melalui referensi interface Shape (polymorphism)
        System.out.println(garis);
        bola.printInfo(); //menampilkan info dari bola
        System.out.println(garis);

        System.out.println("Volume of Cube and Sphere");
        System.out.println("POLYMORPHISM: INTERFACE");
        System.out.println(garis);

        System.out.print("Enter edge : ");
        double edge = in.nextDouble();
        System.out.print("Enter radius : ");
        double radius = in.nextDouble();
        System.out.print("Enter mass : ");
        double mass = in.nextDouble();

        ThreeDimensional kubusV = new Cube(edge, mass); //Membuat objek Cube dengan argumen edge dan mass menggunakan konstruktor berparameter Objek diakses melalui referensi interface ThreeDimensional (konsep polymorphism) Mengasumsikan bahwa class Cube mengimplementasikan interface ThreeDimensional
        ThreeDimensional bolaV = new Sphere(radius, mass); ////Membuat objek Shapre dengan argumen radius dan mass menggunakan konstruktor berparameter Objek diakses melalui referensi interface ThreeDimensional (konsep polymorphism) Mengasumsikan bahwa class Spahre mengimplementasikan interface ThreeDimensional
        Weightable berat = (Weightable) bolaV; //inisialisasi yang dimana kiata akan menghitung berat dari bolaV, atau ini bisa disebut inisialisasi casting

        System.out.printf("Cube's volume     : %.2f%n", kubusV.getVolume());
        System.out.printf("Sphere's volume   : %.2f%n", bolaV.getVolume());
        System.out.printf("Weight            : %.2f%n", berat.getWeight());
    }
}
