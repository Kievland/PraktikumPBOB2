/*Nama: Muhammad Kievlan Hakim*/
/*NIM : 24060123140184*/
/*Praktikum: PBO B2*/

public class Tendik extends Karyawan {
    static int countTendik = 0;

    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        countTendik++;
    }

    @Override
    public double hitungGaji() {
        return 4000000 + (masaKerja * 0.01 * 4000000);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji: " + hitungGaji());
    }
}
