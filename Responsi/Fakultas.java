/*Nama: Muhammad Kievlan Hakim*/
/*NIM : 24060123140184*/
/*Praktikum: PBO B2*/

public class Fakultas {
    private String namaFakultas;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas() {
        this("", 0.0, 0.0);
    }

    public Fakultas(String namaFakultas, double tarifUKT, double gajiPokok) {
        this.namaFakultas = namaFakultas;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}
