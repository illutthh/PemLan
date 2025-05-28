package finalProject.jenis;

import java.util.*;

public abstract class Menu {
    private String nama;


    public Menu (String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public static <T> void printMenu(Collection<T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }

   public static void countdownTimer(int detik) {
    System.out.print("Makanan akan siap dalam: ");
    Timer timer = new Timer();

    TimerTask tugas = new TimerTask() {
        int sisa = detik;

        public void run() {
            if (sisa > 0) {
                System.out.print(sisa + "... ");
                sisa--;
            } else {
                System.out.println("\nMakanan siap disajikan!");
                timer.cancel();
            }
        }
    };

    timer.scheduleAtFixedRate(tugas, 0, 1000); // setiap 1 detik

    // Tunggu hingga selesai agar tidak langsung lanjut ke baris berikutnya
    try {
        Thread.sleep((detik + 1) * 1000); 
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

}
