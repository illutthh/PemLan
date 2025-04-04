package praktic.inheritance.transportation;

public class Bus extends Vehicle {

    static final int FAREstop = 2000;  // deklarasi tarif bus yang di hitung tiap kali bus berhenti, bersifat final dan tidak bisa diubah
    
    public Bus(String nama, int capacity, String route) { //konstruktor bus dengan parameter nama, kapasitas, dan rute
        super(nama, capacity, route); //// memanggil konstruktror dari superclass Vehicle, untuk penginisiasian field
    }

    public void calcualteFare(int stop) { //metode yang digunakan untuk menghitung biaya perjalanan dengan parameter int stop 
        getCurrentPassengers(); // mengambil jumlah penumpang saat ini dengan metode yang ad pada superclass Vehicle
        
        int fare = getCurrentPassengers() * FAREstop * stop; //rumusan untuk menghitung biaya perjalanan dengan mengalikan jumlah penumpang saat ini dengan tarif bus dan jumlah stop
        
        System.out.println("Total Penumpang: " + getCurrentPassengers()); // menampilkan jumlah penumpang saat ini
        System.out.println("Total Pemberhentian: " + stop); //menampilkan jumlah pemberhentian
        System.out.println("Tarif per halte: Rp " + FAREstop); //menampilkan tarif per halte
        System.out.println("Total tarif perjalanan: Rp " + fare); //menapilkan total tarif perjalanan
    }
}