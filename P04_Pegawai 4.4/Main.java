import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", "Andi", 
            LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 
            5000000, "Fakultas Sains dan Matematika", "78647324"
        );

        DosenTamu dosenTamu = new DosenTamu(
            "9876543210", "Budi", 
            LocalDate.of(1985, 3, 10), 
            LocalDate.of(2020, 2, 1), 
            4500000, "Fakultas Teknik", "12345678", 
            LocalDate.of(2026, 3, 1)
        );

        Tendik tendik = new Tendik(
            "1234567890", "Citra", 
            LocalDate.of(1975, 8, 20), 
            LocalDate.of(2000, 7, 1), 
            4000000, "Akademik"
        );

        System.out.println("=== Dosen Tetap ===");
        dosenTetap.printInfo();
        System.out.println();

        System.out.println("=== Dosen Tamu ===");
        dosenTamu.printInfo();
        System.out.println();

        System.out.println("=== Tendik ===");
        tendik.printInfo();
    }
}
