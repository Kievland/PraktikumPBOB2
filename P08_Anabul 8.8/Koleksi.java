// File: Koleksi.java
import java.util.ArrayList; //
import java.util.List; //

// Kelas Koleksi generik dengan 2 atribut: nbelm dan wadah 
public class Koleksi<T> {
    private int nbelm; // Banyaknya elemen efektif koleksi 
    private List<T> wadah; // Nilai-nilai elemen dalam koleksi 

    // Konstruktor
    public Koleksi() {
        this.wadah = new ArrayList<>();
        this.nbelm = 0;
    }

    // Metode getIsi 
    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        }
        return null; // Atau bisa juga throw new IndexOutOfBoundsException("Indeks tidak valid");
    }

    // Metode setIsi (Edit/update) 
    public void setIsi(int index, T value) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, value);
        } else {
            System.out.println("Indeks tidak valid untuk setIsi.");
        }
    }

    // Metode getSize 
    public int getSize() {
        return nbelm;
    }

    // Metode setSize (Untuk ArrayList, ini tidak mengubah kapasitas secara eksplisit,
    // nbelm akan berubah otomatis saat add/delete. Ini hanya sebagai placeholder
    // atau untuk mengubah nbelm secara manual jika diperlukan logika khusus.) 
    public void setSize(int newSize) {
        // Implementasi ini mungkin tidak mengubah kapasitas internal ArrayList secara langsung.
        // nbelm seharusnya mencerminkan jumlah elemen aktual.
        // Jika tujuannya untuk membatasi ukuran, logic penambahan/penghapusan perlu diperiksa.
        // Untuk ArrayList, ukuran efektif diatur oleh add/remove.
        // Jika newSize < nbelm, elemen bisa dihapus. Jika > nbelm, bisa diisi dengan null atau default.
        // Untuk sekarang, kita anggap nbelm hanya cerminan ukuran wadah.
        if (newSize >= 0) {
            // Bisa jadi Anda ingin menghapus elemen jika newSize lebih kecil
            while (nbelm > newSize && nbelm > 0) {
                wadah.remove(nbelm - 1);
                nbelm--;
            }
            // Tidak ada cara untuk menambah elemen jika newSize > nbelm tanpa data
            // Jadi, setSize ini paling relevan untuk mengecilkan koleksi atau tidak digunakan langsung
            // melainkan nbelm diupdate otomatis oleh add/remove
        }
        System.out.println("Peringatan: setSize pada Koleksi berbasis ArrayList umumnya tidak digunakan langsung untuk mengubah kapasitas.");
    }

    // Metode add 
    public void add(T element) {
        wadah.add(element);
        nbelm++;
    }

    // Metode delete 
    public void delete(T element) {
        if (wadah.remove(element)) { // remove mengembalikan true jika elemen ditemukan dan dihapus
            nbelm--;
        } else {
            System.out.println("Elemen " + element + " tidak ditemukan dalam koleksi untuk dihapus.");
        }
    }

    // Metode showAll (menampilkan semua elemen koleksi) 
    public void showAll() {
        if (nbelm == 0) {
            System.out.println("Koleksi kosong.");
            return;
        }
        System.out.println("Elemen dalam koleksi:");
        for (int i = 0; i < nbelm; i++) {
            T element = wadah.get(i);
            // Polymorphism diterapkan di sini: jika elemennya Anabul, panggil metode spesifiknya
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