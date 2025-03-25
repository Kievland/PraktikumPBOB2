import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DosenTetap extends Dosen {
    private String nidn;
    private int BUP = 65; // Batas Usia Pensiun

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getJabatan() {
        return "Dosen Tetap";
    }

    public double hitungTunjangan() {
        Period selisih = Period.between(tmt, LocalDate.now());
        return 0.02 * selisih.getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan       : " + getJabatan());
        System.out.println("NIDN          : " + nidn);
        System.out.println("Tunjangan     : Rp " + hitungTunjangan());
    }
}
