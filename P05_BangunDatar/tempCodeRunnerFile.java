public class main {
    public static void main(String[] args) {
        // Membuat beberapa objek Persegi dan Lingkaran
        BangunDatar B1 = new BangunDatar();
        BangunDatar Persegi1 = new Persegi(10,"Merah", "Hitam");
        BangunDatar Lingkaran1 = new Lingkaran(7,"Hijau", "Merah");

        Persegi Persegi1 = new Persegi(5,"Merah", "Hitam");
        Lingkaran Lingkaran1 = new Lingkaran(14,"Hijau", "Merah");

        Persegi p1 = new Persegi(5, "Merah", "Hitam");
        Persegi p2 = new Persegi(7, "Biru", "Putih");

        Lingkaran l1 = new Lingkaran(4, "Kuning", "Hijau");
        Lingkaran l2 = new Lingkaran(6, "Ungu", "Abu-abu");

        // Print informasi Persegi
        System.out.println("=== Informasi Persegi 1 ===");
        p1.printInfo();
        System.out.println();

        System.out.println("=== Informasi Persegi 2 ===");
        p2.printInfo();
        System.out.println();
    }
}