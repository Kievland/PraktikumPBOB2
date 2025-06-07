public class ContohMetodeGenerik {

    // Metode generik untuk menampilkan info isi dari Datum
    public static <T> void tampilkanIsiDatum(Datum<T> datum) {
        T isi = datum.getIsi();
        System.out.println("Isi datum: " + isi.toString());

        // Jika isi adalah Anabul atau turunannya, kita bisa akses metode spesifik
        if (isi instanceof Anabul) {
            Anabul anabul = (Anabul) isi;
            anabul.suara();
            anabul.gerak();
        }
    }
}
