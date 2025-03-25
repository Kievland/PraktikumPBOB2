import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Tendik extends Pegawai {
    private String bidang;
    private int BUP = 55; // Batas Usia Pensiun

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getJabatan() {
        return "Tendik";
    }

    public LocalDate hitungBUP() {
        LocalDate bupDate = tanggalLahir.plusYears(BUP);
        return bupDate.plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan() {
        Period selisih = Period.between(tmt, LocalDate.now());
        return 0.01 * selisih.getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan       : " + getJabatan());
        System.out.println("Bidang        : " + bidang);
        System.out.println("BUP           : " + formatTanggal(hitungBUP()));
        System.out.println("Tunjangan     : Rp " + hitungTunjangan());
    }
}
