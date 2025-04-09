public class main {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(5, "Merah", "Hitam");
        Persegi p2 = new Persegi(7, "Biru", "Putih");
        Lingkaran l1 = new Lingkaran(4, "Kuning", "Hijau");
        Lingkaran l2 = new Lingkaran(6, "Ungu", "Abu-abu");

        // Print informasi Persegi
        System.out.println("===================== Informasi Persegi p1 ===========================");
        p1.printInfo();
        System.out.println("\n=== Menambah ukuran menjadi 10% lebih besar ===");
        p1.zoomIn();
        p1.printInfo();
        System.out.println("\n=== Mengurangi ukuran menjadi 10% lebih kecil ===");
        p1.zoomOut();
        p1.printInfo();
        System.out.println("\n=== Menskalakan ukuran sesuai dengan input percent yang diberikan. ===");
        p1.zoom(50);
        p1.printInfo();

        System.out.println("\n===================== Informasi Persegi p2 ===========================");
        p2.printInfo();
        System.out.println();
        System.out.println("\n=== Menambah ukuran menjadi 10% lebih besar ===");
        p2.zoomIn();
        p2.printInfo();
        System.out.println("\n=== Mengurangi ukuran menjadi 10% lebih kecil ===");
        p2.zoomOut();
        p2.printInfo();
        System.out.println("\n=== Menskalakan ukuran sesuai dengan input percent yang diberikan. ===");
        p2.zoom(50);
        p2.printInfo();
        
        // Print informasi Lingkaran
        System.out.println("\n===================== Informasi Lingkaran l1 ===========================");
        l1.printInfo();
        System.out.println("\n=== Menambah ukuran menjadi 10% lebih besar ===");
        l1.zoomIn();
        l1.printInfo();
        System.out.println("\n=== Mengurangi ukuran menjadi 10% lebih kecil ===");
        l1.zoomOut();
        l1.printInfo();
        System.out.println("\n=== Menskalakan ukuran sesuai dengan input percent yang diberikan. ===");
        l1.zoom(50);
        l1.printInfo();

        System.out.println("\n===================== Informasi Lingkaran l2 ===========================");
        l2.printInfo();
        System.out.println("\n=== Menambah ukuran menjadi 10% lebih besar ===");
        l2.zoomIn();
        l2.printInfo();
        System.out.println("\n=== Mengurangi ukuran menjadi 10% lebih kecil ===");
        l2.zoomOut();
        l2.printInfo();
        System.out.println("\n=== Menskalakan ukuran sesuai dengan input percent yang diberikan. ===");
        l2.zoom(50);
        l2.printInfo();

        System.out.println("\n==== Mengecek apakah luas dari lingkaran l1 sama dengan persegi p1 ====");
        if (l1.isEqualLuas(p1)) {
            System.out.println("Keliling Lingkaran l1 dan Persegi p1 SAMA.\n");
        } else {
            System.out.println("Keliling Lingkaran l1 dan Persegi p1 TIDAK SAMA.\n");
        }

        // Print counter bangun datar
        BangunDatar.printCounterBangunDatar();
    }
}
