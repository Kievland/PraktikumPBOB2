/*Nama : Muhammad Kievlan Hakim*/
/*Nim  : 2406121340184*/
/*LAB  : PBO B2*/
public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama); 
    }

    @Override
    public void tampilData() {
        int totalGaji = getGajiPokok() + bonus;
        System.out.println("Nama: " + getNama());
        System.out.println("Gaji: " + totalGaji);
    }
}
