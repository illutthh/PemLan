package praktic.inheritance.transportation;

public class Taxi extends Vehicle {

    static final int FARE_PER_KM = 5000; //deklasrasi tarif per KM yang bersifat final dan tidak bisa diubah

    public Taxi(String nama, int capacity, String route) { //Konstruktor Taxi dengan parameter nama, capacity, dan route
        super(nama, capacity, route); // memanggil konstruktror dari superclass Vehicle, untuk penginisiasian field
    }

    public void calcualteFare(int distance) { //metode yang digunakan untuk menghitung biaya perjalanan
        getCurrentPassengers(); // mengambil jumlah penumpang saat ini dengan metode yang ad pada superclass Vehicle

        int fare = getCurrentPassengers() * FARE_PER_KM * distance; //rumusan menghitung total tarif per KM dengan mengalikan tarif per KM dengan jumlah penumpang dan jarak perjalanan
        
        System.out.println("Total Penumpang: " + getCurrentPassengers()); // menampilkan jumlah penumpang saat ini
        System.out.println("Total jarak rute: " + distance + " KM"); //menampilkan jarak perjalanan per KM
        System.out.println("Tarif per KM: Rp " + FARE_PER_KM); //menapilkan tarif per KM
        System.out.println("Total tarif perjalanan: Rp " + fare); //menampilkan total tarif perjalanan
    }

}