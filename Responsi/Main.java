/*Nama: Muhammad Kievlan Hakim*/
/*NIM : 24060123140184*/
/*Praktikum: PBO B2*/

public class Main {
    public static void main(String[] args) {
        Universitas universitas = new Universitas("Universitas Diponegoro");

        Fakultas fakultasInformatika = new Fakultas("Fakultas Sains dan Matematika", 5000000, 7000000);

        universitas.addFakultas(fakultasInformatika);

        Mahasiswa mhs1 = new Mahasiswa("Andi", "andi@email.com", "2201101", 3, fakultasInformatika);

        Dosen dosen1 = new Dosen("Dr. Rina", "rina@email.com", "D001", 10, fakultasInformatika);

        Tendik tendik1 = new Tendik("Pak Joko", "joko@email.com", "T001", 15);
        Tendik tendik2 = new Tendik("Bu Siti", "siti@email.com", "T002", 8);

        System.out.println("\n===== Informasi Universitas =====");
        universitas.printUniversitas();

        System.out.println("\n===== Informasi Fakultas =====");
        System.out.println(fakultasInformatika.getNamaFakultas() + " | Tarif UKT: " + fakultasInformatika.getTarifUKT());

        System.out.println("\n===== Informasi Mahasiswa =====");
        mhs1.printInfo();

        System.out.println("\n===== Informasi Dosen =====");
        dosen1.printInfo();

        System.out.println("\n===== Informasi Tendik =====");
        tendik1.printInfo();
        System.out.println();
        tendik2.printInfo();

        System.out.println("\n===== Statistik Civitas Akademika =====");
        System.out.println("Total Mahasiswa: " + Mahasiswa.countMahasiswa);
        System.out.println("Total Dosen: " + Dosen.countDosen);
        System.out.println("Total Tendik: " + Tendik.countTendik);
    }
}
