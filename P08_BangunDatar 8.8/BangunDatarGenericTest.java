// File: BangunDatarGenericTest.java
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Uji Lingkaran (dari contoh modul)
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<>();
        bdgLingkaran.set(l);
        System.out.println("Keliling Lingkaran : " + bdgLingkaran.hitungKeliling());
        System.out.println("Tipe Generic : " + bdgLingkaran.get().getClass().getName());
        System.out.println("------------------------------------");

        // Uji Persegi
        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<>();
        bdgPersegi.set(p);
        System.out.println("Luas Persegi : " + bdgPersegi.hitungLuas());
        System.out.println("Keliling Persegi : " + bdgPersegi.hitungKeliling());
        System.out.println("Tipe Generic : " + bdgPersegi.get().getClass().getName());
        System.out.println("------------------------------------");


        // Uji Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(6, 4);
        BangunDatarGeneric<PersegiPanjang> bdgPersegiPanjang = new BangunDatarGeneric<>();
        bdgPersegiPanjang.set(pp);
        System.out.println("Luas Persegi Panjang : " + bdgPersegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang : " + bdgPersegiPanjang.hitungKeliling());
        System.out.println("Tipe Generic : " + bdgPersegiPanjang.get().getClass().getName());
        System.out.println("------------------------------------");

        // Uji Segitiga (misalnya segitiga siku-siku dengan alas 3, tinggi 4, sisi miring 5)
        Segitiga s = new Segitiga(3, 4, 5, 4); // alas, tinggi, sisi1, sisi2 (sisi2 bisa dianggap sama dengan tinggi untuk segitiga siku-siku, atau sesuaikan)
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<>();
        bdgSegitiga.set(s);
        System.out.println("Luas Segitiga : " + bdgSegitiga.hitungLuas());
        System.out.println("Keliling Segitiga : " + bdgSegitiga.hitungKeliling());
        System.out.println("Tipe Generic : " + bdgSegitiga.get().getClass().getName());
    }
}