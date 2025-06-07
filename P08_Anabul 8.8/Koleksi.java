// File: Koleksi.java
import java.util.ArrayList; //
import java.util.List; //

public class Koleksi<T> {
    private int nbelm; 
    private List<T> wadah; 

    // Konstruktor
    public Koleksi() {
        this.wadah = new ArrayList<>();
        this.nbelm = 0;
    }

    // Method
    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        }
        return null; 
    }

    public void setIsi(int index, T value) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, value);
        } else {
            System.out.println("Indeks tidak valid untuk setIsi.");
        }
    }


    public int getSize() {
        return nbelm;
    }


    public void setSize(int newSize) {

        if (newSize >= 0) {
            while (nbelm > newSize && nbelm > 0) {
                wadah.remove(nbelm - 1);
                nbelm--;
            }

        }
        System.out.println("Peringatan: setSize pada Koleksi berbasis ArrayList umumnya tidak digunakan langsung untuk mengubah kapasitas.");
    }

    public void add(T element) {
        wadah.add(element);
        nbelm++;
    }

    public void delete(T element) {
        if (wadah.remove(element)) { 
            nbelm--;
        } else {
            System.out.println("Elemen " + element + " tidak ditemukan dalam koleksi untuk dihapus.");
        }
    }

    public void showAll() {
        if (nbelm == 0) {
            System.out.println("Koleksi kosong.");
            return;
        }
        System.out.println("Elemen dalam koleksi:");
        for (int i = 0; i < nbelm; i++) {
            T element = wadah.get(i);
            if (element instanceof Anabul) {
                Anabul anabul = (Anabul) element;
                System.out.println("Nama: " + anabul.getNama());
                anabul.bersuara(); // 
                anabul.gerak(); // 
            } else {
                System.out.println("Elemen ke-" + (i + 1) + ": " + element.toString());
            }
            System.out.println("--------------------");
        }
    }
}