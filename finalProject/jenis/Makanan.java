    package finalProject.jenis;

    import finalProject.interfaces.*;

    public class Makanan extends Menu implements InfoMakanan {
        
        private double harga;
        private String deskripsi;

        public Makanan(String nama, String deskripsi, double harga) {
            super(nama);
            this.harga = harga;
            this.deskripsi = deskripsi;
        }

        public double getHarga() {
            return harga;
        }
        
        public String getDeskripsi() {
            return deskripsi;
        }
        
        @Override
        public String Infomakanan() {
            return "Nama Makanan: " + getNama() + " Harga: " + getHarga() + " Deskripsi: " + getDeskripsi();
        }

    }
