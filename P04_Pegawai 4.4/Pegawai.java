import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getMasaKerja() {
        LocalDate hariIni = LocalDate.now();
        Period selisih = Period.between(tmt, hariIni);
        return selisih.getYears() + " tahun " + selisih.getMonths() + " bulan";
    }

    public String formatTanggal(LocalDate tgl) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tgl.format(formatter);
    }

    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT           : " + formatTanggal(tmt));
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Masa Kerja    : " + getMasaKerja());
    }
}
