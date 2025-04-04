package praktic.inheritance.mains;

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Taxi;
import praktic.inheritance.transportation.Train;

public class Main {
    public static void main(String[] args) {
        Bus Bus = new Bus("Metro bus", 50, "Terminal A - Terminal B"); //membuat nama objek bus dengan parameter nama, capacity, dan route
        Taxi Taxi = new Taxi("Uber taxi", 4, "Bandara - Hotel"); //membuat nama objek taxi dengan parameter nama, capacity, dan route
        Train Train = new Train("KRL", 200, "Stasiun Kota - Stasiun Pusat"); //membuat nama objek Train dengan parameter nama, capacity, dan route


        Bus.startJourney(); //bus memulai perjalanan
        Bus.boardPassengers(30); //bus menerima penumpang sebanyak 30 orang
        Bus.boardPassengers(20); //bus menerima penumpang sebanyak 20 orang
        Bus.getCurrentPassengers(); //menampilkan jumlah penumpang saat ini
        Bus.calcualteFare(5); //menghitung biaya tiket bus sebanyak 5 kali berhenti 
        Bus.endJourney(); //bus berhenti perjalanan
        Bus.dropPassengers(40); //bus menurunkan penumpang sebanyak 40 orang
        System.out.println(); //memberi spasi antar output
        System.out.println("--------------------------------------------------"); //memberi garis horizontal untuk memisahkan antar objek

        Train.startJourney(); //kereta api memulai perjalanan
        Train.boardPassengers(150); //kereta api menerima penumpang sebanyak 150 orang
        Train.calcualteFare(); //menghitung biaya tiket kereta api dengan jumlah penumpang yang ada
        Train.endJourney(); //kerta api berhenti perjalanan
        Train.dropPassengers(150); //kerta api menurunkan penumpang sebanyak 150 orang
        System.out.println(); //memberi spasi antar output
        System.out.println("--------------------------------------------------");

        Taxi.startJourney(); //taxi memulai perjalanan
        Taxi.boardPassengers(3); //menerima penumpang sebanyak 3 orang
        Taxi.calcualteFare(10); //menghitung biaya tiket taxi dengan patokan 10 KM
        Taxi.endJourney(); //taxi berhenti perjalanan
        Taxi.dropPassengers(3); //taxi menurunkan penumpang sebanyak 3 orang
        System.out.println();
        System.out.println("--------------------------------------------------");

        Bus.startJourney();
        Bus.boardPassengers(30);
        Bus.boardPassengers(100); //mengangkut penumpang melebihi kapasitas bus, maka penumpang yang melebihi akan ditolak
        Bus.getCurrentPassengers();
        Bus.calcualteFare(5);
        Bus.endJourney();
        Bus.dropPassengers(30); //menurunkan penumpang sebanyak 30 orang
        Bus.dropPassengers(30); //menurunkan penumpang sebanyka 30.namun, penumpang yang di turunkan tidak ada dikarnakan hanya ada 30 penumpang dan 30 penumpang sudah turun
        System.out.println();
        System.out.println("--------------------------------------------------");

        Train.startJourney();
        Train.boardPassengers(150);
        Train.boardPassengers(300); //mengangkut penumpang melebihi kapasitas kereta api, maka penumpang yang melebihi akan ditolak
        Train.calcualteFare();
        Train.endJourney();
        Train.dropPassengers(150); //menurunkan penumpang sebanyak 150 orang
        Train.dropPassengers(150); //menurunkan penumpang sebanyka 150.namun, penumpang yang di turunkan tidak ada dikarnakan hanya ada 150 penumpang dan 150 penumpang sudah turun
        System.out.println();
        System.out.println("--------------------------------------------------");

        Taxi.startJourney();
        Taxi.boardPassengers(3);
        Taxi.boardPassengers(10); //mengangkut penumpang melebihi taxi, maka penumpang yang melebihi akan ditolak
        Taxi.calcualteFare(10);
        Taxi.endJourney();
        Taxi.dropPassengers(3); //menurunkan penumpang sebanyak 3 orang
        Taxi.dropPassengers(3); //menurunkan penumpang sebanyka 3.namun, penumpang yang di turunkan tidak ada dikarnakan hanya ada 3 penumpang dan 3 penumpang sudah turun
        System.out.println();
        System.out.println("--------------------------------------------------");
    }
}