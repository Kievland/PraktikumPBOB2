//Nama: Muhammad Kievlan Hakim
//NIM : 24060123140184
//Lab : PBO B2
//File: PNS.java

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    private String nip;
    static int counterPNS;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    @Override
    public double hitungPajak(){
        return pendapatan * 0.1;
    }

    @Override
    public int hitungMasaKerja(){
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
    }

    public static int getCounterPNS(){
        return counterPNS;
    }
}