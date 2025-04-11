public class SistemLelang {
    public static void main(String[] args) {
        // Daftar peserta
        Peserta andi = new Peserta("Andi", 9000000);
        Peserta budi = new Peserta("Budi", 25000000);
        Peserta iwan = new Peserta("Iwan", 30000000);
        Peserta dina = new Peserta("Dina", 10000000);
        Peserta eka = new Peserta("Eka", 5000000);

        // Barang lelang
        Elektronik kamera = new Elektronik("Kamera DSLR Canon", 4000000, 2);
        Seni lukisan = new Seni("Lukisan Abstrak Modern", 8000000, "Seniman Lokal");
        Elektronik tv = new Elektronik("Smart TV 55 Inch", 7000000, 2);
        Seni patung = new Seni("Patung Liberty Mini", 3000000, "Unknown Artist");

        // Lelang kamera
        kamera.mulaiLelang();
        budi.tawar(kamera, 4500000);
        dina.tawar(kamera, 5000000);
        andi.tawar(kamera, 5500000);
        budi.tawar(kamera, 6000000);
        kamera.tutupLelang();
        iwan.tawar(kamera, 6500000);

        // Lelang lukisan
        lukisan.mulaiLelang();
        eka.tawar(lukisan, 7000000);
        budi.tawar(lukisan, 9000000);
        iwan.tawar(lukisan, 10000000);
        lukisan.tutupLelang();

        // Lelang TV
        tv.mulaiLelang();
        iwan.tawar(tv, 7500000);
        budi.tawar(tv, 8000000);
        dina.tawar(tv, 8500000);
        iwan.tawar(tv, 8000000);
        eka.tawar(tv, 9000000);
        iwan.tawar(tv, 9500000);
        tv.tutupLelang();

        // Lelang Patung
        patung.mulaiLelang();
        eka.tawar(patung, 4000000);
        dina.tawar(patung, 4500000);
        budi.tawar(patung, 5000000);
        eka.tawar(patung, 4500000);
        patung.tutupLelang();
        andi.tawar(patung, 5500000);
    }
}
