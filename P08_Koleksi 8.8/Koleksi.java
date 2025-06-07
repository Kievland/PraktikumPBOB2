// File: Koleksi.java
import java.util.ArrayList;
import java.util.List;

public class Koleksi<T> {
    private int nbelm; 
    private List<T> wadah; 

    public Koleksi() {
        this.wadah = new ArrayList<>();
        this.nbelm = 0;
    }

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
            System.out.println("Indeks tidak valid.");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        System.out.println("setSize tidak direkomendasikan untuk ArrayList, gunakan add/remove.");
    }

    public void add(T element) {
        wadah.add(element);
        nbelm++;
    }

    public void delete(T element) {
        if (wadah.remove(element)) {
            nbelm--;
        } else {
            System.out.println("Elemen tidak ditemukan untuk dihapus.");
        }
    }

    public void showAll() {
        if (nbelm == 0) {
            System.out.println("Koleksi kosong.");
            return;
        }
        System.out.println("Elemen dalam koleksi:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + wadah.get(i));
        }
    }
}