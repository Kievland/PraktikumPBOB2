/*Nama : Muhammad Kievlan Hakim*/
/*Nim  : 2406121340184*/
/*LAB  : PBO B2*/
public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama); 
    }

    @Override
    public void tampilData() {
        int totalGaji = getGajiPokok() + tunjangan;
        System.out.println("Nama: " + getNama());
        System.out.println("Gaji: " + totalGaji);
    }
}
