/**
 * File: Lingkaran.java
 * Deskripsi: implementasi Lingkaran sebagai BangunDatar
 */
public class Lingkaran extends BangunDatar { // 
    private double jejari; // 

    public Lingkaran(double jejari) { // 
        this.jejari = jejari; // 
    }

    @Override
    public double hitungKeliling() { // 
        return 2 * jejari * 3.14; // 
    }

    @Override
    public double hitungLuas(){
        return jejari*jejari*3.14;
    }
}