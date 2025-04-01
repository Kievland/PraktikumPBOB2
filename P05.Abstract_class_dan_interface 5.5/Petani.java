//Nama: Muhammad Kievlan Hakim
//NIM : 24060123140184
//Lab : PBO B2
//File: Petani.java

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia{
    private String asal_kota;
    static int counterPetani;

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota(){
        return asal_kota;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }
    
    @Override
    public int hitungMasaKerja(){
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
    }

    public static int getCounterPetani(){
        return counterPetani;
    }
}