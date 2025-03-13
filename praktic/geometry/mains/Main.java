package praktic.geometry.mains;

import java.util.Scanner;

import praktic.geometry.Shapes.Circle;
import praktic.geometry.Shapes.Rectangle;

public class Main {
    static String GREEN = "\u001B[32m";
    static String Cyan = "\u001B[96m";
    static String WHITE = "\u001B[37m";
    static void printgaris(){
        System.out.println(Cyan+"=====================================");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        printgaris();
        
        System.out.print(WHITE+"Nama : ");
        String nama = in.nextLine();
        System.out.print(WHITE+"NIM : ");
        long NIM = in.nextLong();
        
        printgaris();
        
        System.out.println(GREEN+"CIRCLE");
        
        printgaris();
        
        System.out.print(WHITE+"ID : ");
        int setID = in.nextInt();
        System.out.print(WHITE+"Radius : ");
        double setRadius = in.nextDouble();
        
        Circle lingkar = new Circle();
        lingkar.setID(setID);
        lingkar.setRadius(setRadius);

        printgaris();
        
        lingkar.deskripsi1();
        
        printgaris();
        
        System.out.println(GREEN+"Rectangle");
        
        printgaris();
        
        System.out.print(WHITE+"ID : ");
        int ID = in.nextInt();
        System.out.print(WHITE+"Panjang : ");
        double panjang = in.nextDouble();
        System.out.print(WHITE+"Lebar : ");
        double lebar = in.nextDouble();
        
        printgaris();
        
        Rectangle persegi = new Rectangle(ID, panjang,lebar);
        persegi.PrintDeskirpsi();
        printgaris();
    }
}
