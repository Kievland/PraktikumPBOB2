// File: KoleksiAnabulTest.java
import java.util.Random; 
import java.util.ArrayList; 
import java.util.List; 

public class KoleksiAnabulTest {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>(); 
        Random random = new Random();

        
        for (int i = 0; i < 10; i++) {
            int jenis = random.nextInt(3);
            String namaAnabul = "Anabul" + (i + 1); 

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
        
        koleksiAnabul.showAll(); 
        System.out.println("\nUkuran koleksi: " + koleksiAnabul.getSize()); // 

        
        if (koleksiAnabul.getSize() > 0) {
            Anabul anabulToDelete = koleksiAnabul.getIsi(0);
            System.out.println("\nMencoba menghapus Anabul pertama: " + anabulToDelete.getNama());
            koleksiAnabul.delete(anabulToDelete); 
            System.out.println("\nIsi koleksi setelah penghapusan:");
            koleksiAnabul.showAll();
            System.out.println("Ukuran koleksi setelah penghapusan: " + koleksiAnabul.getSize());
        }
        if (koleksiAnabul.getSize() > 0) {
            String newName = "AnabulBaru";
            Anabul updatedAnabul = new Kucing(newName); 
            System.out.println("\nMencoba mengubah elemen pertama menjadi Kucing bernama " + newName);
            koleksiAnabul.setIsi(0, updatedAnabul);  
            System.out.println("\nIsi koleksi setelah update:");
            koleksiAnabul.showAll();
        }
    }
}