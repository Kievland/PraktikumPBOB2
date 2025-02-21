//Nama: Muhammad Kievlan Hakim
//NIM :24060123140184
//Lab :B2 Pemrograman Berorientasi Objek

public class Garis {
    // Atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    static int counterGaris;

    //Konstruktor
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    static int getCountGaris(){
        return counterGaris;
    }


    // Konstruktor dengan Titik
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    // Getter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Setter
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Menghitung panjang garis
    public double panjangGaris() {
        double X = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double Y = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(X * X + Y * Y);
    }

    // Menghitung gradient garis
    public double gradient() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        if (deltaX == 0) return Double.POSITIVE_INFINITY; // Jika garis vertikal
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / deltaX;
    }

    // Menghitung titik tengah garis
    public Titik titikTengah() {
        double X = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double Y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(X, Y);
    }

    // Menentukan apakah sejajar dengan garis lain
    public boolean Sejajar(Garis g) {
        return Math.abs(this.gradient() - g.gradient()) < 1e-9;
    }

    // Menentukan apakah tegak lurus dengan garis lain
    public boolean TegakLurus(Garis g) {
        return Math.abs(this.gradient() * g.gradient() + 1) < 1e-9;
    }

    // Menampilkan titik awal dan titik akhir garis
    public void tampilkanGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis
    public void PersamaanGaris() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double m = this.gradient();
        double c = y1 - (m * x1);

        System.out.printf("Persamaan garis: y = %.2fx + %.2f%n", m, c);
    }

    void printCountGaris(){
        System.out.println(this.counterGaris);
    }
}



