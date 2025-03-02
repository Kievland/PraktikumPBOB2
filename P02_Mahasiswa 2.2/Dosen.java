//Nama: Muhammad Kievlan Hakim
//NIM :24060123140184
//Lab :B2 Pemrograman Berorientasi Objek

public class Dosen{

    //Atribut
    private String nip;
    private String nama;
    private String prodi;

    //Methode
    public Dosen(){
        this("","","");
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //Selektor
    public String getNip(String nip){
        return nip;
    }

    public String getNama(String nama){
        return nama;
    }

    public String getProdi(String prodi){
        return prodi;
    }

    //Mutator
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void printDosen() {
        System.out.println("Dosen: " + nip + " - " + nama + " (" + prodi + ")");
    }
}