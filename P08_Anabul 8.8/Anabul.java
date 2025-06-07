// File: Anabul.java
// Berdasarkan diagram kelas, Anabul adalah kelas induk dan memiliki metode Gerak() dan Bersuara().
// Karena kelas anak memiliki gerakan dan suara yang unik, method ini harus abstrak di kelas induk.
public abstract class Anabul { // 
    // Atribut
    protected String nama; // 

    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Method abstrak untuk gerakan dan suara yang akan diimplementasikan oleh kelas anak
    public abstract void gerak(); // 
    public abstract void bersuara(); // 
}