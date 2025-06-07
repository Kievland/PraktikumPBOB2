// File: main.java 
public class main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        // Menambahkan 10 karakter acak
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) ('A' + (int) (Math.random() * 26)); 
            koleksiKarakter.add(randomChar);
        }

        System.out.println("Isi koleksi karakter setelah penambahan:");
        koleksiKarakter.showAll();
        System.out.println("Ukuran koleksi: " + koleksiKarakter.getSize());

        System.out.println("\nMengubah elemen ke-3 menjadi 'X'");
        koleksiKarakter.setIsi(2, 'X');
        koleksiKarakter.showAll();

        System.out.println("\nMenghapus elemen 'A' (jika ada)");
        koleksiKarakter.delete('A');
        koleksiKarakter.showAll();
        System.out.println("Ukuran koleksi setelah penghapusan: " + koleksiKarakter.getSize());

        System.out.println("\nMengambil elemen pertama: " + koleksiKarakter.getIsi(0));
    }
}