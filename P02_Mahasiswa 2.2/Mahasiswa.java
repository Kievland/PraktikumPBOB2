//Nama: Muhammad Kievlan Hakim
//NIM :24060123140184
//Lab :B2 Pemrograman Berorientasi Objek

import java.util.ArrayList;
class Mahasiswa {

    //Atribut
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<Matakuliah> listMatkul; 
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //Methode
    public Mahasiswa() {
        this.listMatkul = new ArrayList<>(); 
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>(); 
    }

    //Selektor
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(Matakuliah matkul) {
        if (listMatkul.size() < 50) {
            listMatkul.add(matkul); 
        } else {
            System.out.println("Maksimal 50 mata kuliah!");
        }
    }

    //Mutator
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (Matakuliah matkul : listMatkul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("Mahasiswa: " + nim + " - " + nama + " (" + prodi + ")");
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Jumlah Mata Kuliah: " + getJumlahMatKul());
        System.out.println("Total SKS: " + getJumlahSKS());
        System.out.println("Daftar Mata Kuliah:");
        for (Matakuliah matkul : listMatkul) {
            matkul.printMatkul();
        }
        if (dosenWali != null) {
            dosenWali.printDosen();
        }
        if (kendaraan != null) {
            kendaraan.printKendaraan();
        }
        System.out.println("------------------------------------------------");
    }
}