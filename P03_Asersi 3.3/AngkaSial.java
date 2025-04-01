public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println("Angka " + angka + " bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas Exception
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*Baris 6 dieksekusi jika tidak terjadi eksepsi. 
Namun, jika terjadi eksepsi sebelum mencapai baris 12, maka baris ini akan dilewati.
Maka baris 15 akan dieksekusi jika eksepsi tertangkap oleh blok catch.
Jika tidak ada eksepsi atau eksepsi tidak ditangani dengan benar, maka
 baris ini tidak akan dieksekusi. */