import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate akhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate akhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public String getJabatan() {
        return "Dosen Tamu";
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan       : " + getJabatan());
        System.out.println("NIDK          : " + nidk);
        System.out.println("Kontrak Berakhir: " + formatTanggal(akhirKontrak));
        System.out.println("Tunjangan     : Rp " + hitungTunjangan());
    }
}
