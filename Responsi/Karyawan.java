/*Nama: Muhammad Kievlan Hakim*/
/*NIM : 24060123140184*/
/*Praktikum: PBO B2*/

public class Karyawan extends CivitasAkademika {
    protected String NIP;
    protected int masaKerja;

    public Karyawan() {
        this("", "", "", 0);
    }

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public double hitungGaji() {
        return 0; 
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
}
