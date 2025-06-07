// File: Segitiga.java
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1; // Sisi lain untuk keliling
    private double sisi2; // Sisi lain untuk keliling

    // Konstruktor dengan alas dan tinggi (untuk luas), dan sisi-sisi lain (untuk keliling)
    public Segitiga(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + sisi1 + sisi2;
    }
}