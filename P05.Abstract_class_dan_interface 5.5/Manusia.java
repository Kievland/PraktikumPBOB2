//Nama: Muhammad Kievlan Hakim
//NIM : 24060123140184
//Lab : PBO B2
//File: Manusia.java

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Manusia{
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    static int counterMns;

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public abstract double hitungPajak();
    public abstract int hitungMasaKerja();
    
    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal mulai kerja: " + tgl_mulai_kerja.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
    
    public static int getCounterMns(){
        return counterMns;
    }
}