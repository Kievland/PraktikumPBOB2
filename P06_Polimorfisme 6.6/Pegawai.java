/*Nama : Muhammad Kievlan Hakim*/
/*Nim  : 2406121340184*/
/*LAB  : PBO B2*/
public class Pegawai {
    // Atribut
    private String nama;
    private int gajiPokok = 5000000;

    public Pegawai(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
