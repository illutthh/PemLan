package praktic.inheritance.transportation;

public class Train extends Vehicle {

    static final int FIXED_FARE = 10000; //deklasrasi dimana nilai fixed fare diatur dan bersifat final tidak bisa diubah

    public Train(String nama, int capacity, String route) { //Konstruktor Train dengan parameter nama, capacity, dan route
        super(nama, capacity, route); // memanggil konstruktror dari superclass Vehicle, untuk penginisiasian field
    }

    public void calcualteFare(){ //metode yang digunakan untuk menghitung biaya perjalanan
        getCurrentPassengers(); // mengambil jumlah penumpang saat ini dengan metode yang ad pada superclass Vehicle

        int fare = FIXED_FARE * getCurrentPassengers(); //rumusan untuk menghitung biaya perjalanan dengan mengalikan biaya tetap dengan jumlah penumpang saat ini
        
        System.out.println("Total Penumpang: Rp" + getCurrentPassengers()); //menampilkan jumlah penumpang saat ini
        System.out.println("Tarif tetap per penumpang: " + FIXED_FARE); //menampilkan biaya tetap per penumpang
        System.out.println("Total tarif perjalanan: Rp " + fare); //menampilkan total tarif perjalanan
    }

}