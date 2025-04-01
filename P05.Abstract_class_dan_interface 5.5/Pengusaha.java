//Nama: Muhammad Kievlan Hakim
//NIM : 24060123140184
//Lab : PBO B2
//File: Pengusaha.java

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    static int counterPengusaha;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    @Override
    public double hitungPajak(){
        return pendapatan * 0.15;
    }
    
    @Override
    public int hitungMasaKerja(){
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }
}