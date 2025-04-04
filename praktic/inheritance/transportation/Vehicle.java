package praktic.inheritance.transportation;

public class Vehicle {
    private String nama, route;
    private int capacity;
    private int currentPassengers;

    public Vehicle(String nama, int capacity, String route) {
        this.nama = nama;
        this.route = route;
        this.capacity = capacity;
        this.currentPassengers = 0;
    }

    public void boardPassengers(int count) { //berfungsi unutuk menampilkan pesan ketika ada penumpang yang naik, dimana jumlah
        if (currentPassengers + count > capacity) { //penumpang tidak lebh dr kapasitas maka akan "menampilkan penumpang naik kedalam", namun
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang");// jika tidak akan menampilkan "Kapasitas penuh! Tidak dapat menaikkan"
        } else {
            currentPassengers += count;
            System.out.println(count + " Penumpang naik ke dalam " + nama);
        }
    }
    
    public void dropPassengers(int count) { //mengeluarkan outputan menurunkan penumpang, apabila penumpang di dalam kurang dari count 
        if (currentPassengers - count < 0) {//maka akan menanpilkan pesan "Tidak ada cukup penumpang untuk turun"
            System.out.println("Tidak ada cukup penumpang untuk turun");
        } else {
            currentPassengers -= count;
            System.out.println(count + " Penumpang berhasil turun dari " + nama);
        }
    }
    
    public void startJourney() { //metode yang akan mencetak outputan berupa memulai perjalanan
        System.out.println(nama + " mulai perjalanan di " + route);
    }
    
    public void endJourney() { //metode yang akan mencetak outputan berupa mengakhiri perjalanan
        System.out.println(nama + " mencapai tujuan akhir dan berhenti");
    }
    
    public void calcuateFare() { //metode yang akan menghitung biaya perjalanan dan akan di gunakan di dalma subclass
        calcuateFare();
    }
    
    public int getCurrentPassengers() { //menampilkan jumlah penumpang nanti nya dan metode ini digunakan di dalam sub class 
        return currentPassengers;
    }
}