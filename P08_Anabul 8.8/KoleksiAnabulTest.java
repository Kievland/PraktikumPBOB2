// File: KoleksiAnabulTest.java
import java.util.Random; //
import java.util.ArrayList; // Import ini tidak dibutuhkan lagi jika Koleksi sudah menangani List internal
import java.util.List; // Import ini tidak dibutuhkan lagi jika Koleksi sudah menangani List internal

public class KoleksiAnabulTest {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>(); // Menggunakan implementasi Koleksi yang benar 
        Random random = new Random();

        // Mengisi objek koleksi dengan 10 elemen acak (Kucing, Anjing, Burung) 
        for (int i = 0; i < 10; i++) {
            int jenis = random.nextInt(3); // 0: Kucing, 1: Anjing, 2: Burung
            String namaAnabul = "Anabul" + (i + 1); // Nama unik untuk setiap anabul

            switch (jenis) {
                case 0:
                    koleksiAnabul.add(new Kucing(namaAnabul));
                    break;
                case 1:
                    koleksiAnabul.add(new Anjing(namaAnabul));
                    break;
                case 2:
                    koleksiAnabul.add(new Burung(namaAnabul));
                    break;
            }
        }

        System.out.println("--- Simulasi Koleksi Anabul ---");
        // Memanggil showAll dari kelas Koleksi yang sudah diperbarui
        koleksiAnabul.showAll(); // 

        // Contoh penggunaan metode Koleksi lainnya
        System.out.println("\nUkuran koleksi: " + koleksiAnabul.getSize()); // 

        // Coba hapus satu elemen
        if (koleksiAnabul.getSize() > 0) {
            Anabul anabulToDelete = koleksiAnabul.getIsi(0);
            System.out.println("\nMencoba menghapus Anabul pertama: " + anabulToDelete.getNama());
            koleksiAnabul.delete(anabulToDelete); // 
            System.out.println("\nIsi koleksi setelah penghapusan:");
            koleksiAnabul.showAll();
            System.out.println("Ukuran koleksi setelah penghapusan: " + koleksiAnabul.getSize());
        }

        // Coba update satu elemen
        if (koleksiAnabul.getSize() > 0) {
            String newName = "AnabulBaru";
            Anabul updatedAnabul = new Kucing(newName); // Misal diganti jadi kucing baru
            System.out.println("\nMencoba mengubah elemen pertama menjadi Kucing bernama " + newName);
            koleksiAnabul.setIsi(0, updatedAnabul); // 
            System.out.println("\nIsi koleksi setelah update:");
            koleksiAnabul.showAll();
        }
    }
}