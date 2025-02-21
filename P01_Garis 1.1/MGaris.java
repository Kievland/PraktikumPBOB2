//Nama: Muhammad Kievlan Hakim
//NIM :24060123140184
//Lab :B2 Pemrograman Berorientasi Objek

public class MGaris {
    public static void main(String[] args) {
        // Membuat titik awal dan titik akhir untuk garis pertama
        Titik p1 = new Titik(-2, 0);
        Titik p2 = new Titik(0, 4);
        Garis garis1 = new Garis(p1, p2);

        // Membuat titik awal dan titik akhir untuk garis kedua
        Titik p3 = new Titik(1, 2);
        Titik p4 = new Titik(3, 6);
        Garis garis2 = new Garis(p3, p4);

        // Menampilkan informasi garis
        System.out.println("Informasi Garis 1:");
        garis1.tampilkanGaris();
        System.out.println("Panjang Garis 1: " + garis1.panjangGaris());
        System.out.println("Gradien Garis 1: " + garis1.gradient());
        System.out.println("Titik Tengah Garis 1: (" + garis1.titikTengah().getAbsis() + ", " + garis1.titikTengah().getOrdinat() + ")");
        garis1.PersamaanGaris();

        System.out.println("\nInformasi Garis 2:");
        garis2.tampilkanGaris();
        System.out.println("Panjang Garis 2: " + garis2.panjangGaris());
        System.out.println("Gradien Garis 2: " + garis2.gradient());
        System.out.println("Titik Tengah Garis 2: (" + garis2.titikTengah().getAbsis() + ", " + garis2.titikTengah().getOrdinat() + ")");
        garis2.PersamaanGaris();

        // Mengecek apakah garis sejajar
        if (garis1.Sejajar(garis2)) {
            System.out.println("\nGaris 1 dan Garis 2 sejajar.");
        } else {
            System.out.println("\nGaris 1 dan Garis 2 tidak sejajar.");
        }

        // Mengecek apakah garis tegak lurus
        if (garis1.TegakLurus(garis2)) {
            System.out.println("Garis 1 dan Garis 2 tegak lurus.");
        } else {
            System.out.println("Garis 1 dan Garis 2 tidak tegak lurus.");
        }
    }
}
