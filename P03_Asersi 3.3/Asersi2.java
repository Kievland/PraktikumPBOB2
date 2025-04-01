class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungkeliling(){
        double keliling = 2 * Math.PI*jarijari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        double jarijari = -1 ;
        assert (jarijari > 0);
        Lingkaran l = new Lingkaran(jarijari);
        double kelilinglingkaran = l.hitungkeliling();
        System.out.println("Keliling lingkaran = " + kelilinglingkaran);
    }
}

/*Asersi digunakan untuk memastikan bahwa kondisi tertentu benar selama eksekusi program.
Jika ada nilai yang tidak valid (misalnya nilai negatif untuk jari-jari lingkaran), 
program seharusnya menangani ini dengan eksepsi, bukan hanya asersi.
Asersi yang seharusnya digunakan untuk mendeteksi kesalahan pemrograman, 
bukan untuk penanganan input yang salah dari pengguna.
Jika asersi dinonaktifkan saat runtime, 
program mungkin tetap berjalan meskipun nilai yang dimasukkan salah.*/