/*Nama: Muhammad Kievlan Hakim*/
/*NIM : 24060123140184*/
/*Praktikum: PBO B2*/

import java.util.ArrayList;

public class Universitas {
    private String namaUniv;
    private ArrayList<Fakultas> listFakultas;

    public Universitas() {
        this.listFakultas = new ArrayList<>();
    }

    public Universitas(String namaUniv) {
        this.namaUniv = namaUniv;
        this.listFakultas = new ArrayList<>();
    }

    public String getNamaUniv() {
        return namaUniv;
    }

    public void setNamaUniv(String namaUniv) {
        this.namaUniv = namaUniv;
    }

    public void addFakultas(Fakultas fakultas) {
        listFakultas.add(fakultas);
    }

    public void printUniversitas() {
        System.out.println("Nama Universitas: " + getNamaUniv());
    }
}
