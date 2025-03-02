//Nama: Muhammad Kievlan Hakim
//NIM :24060123140184
//Lab :B2 Pemrograman Berorientasi Objek

public class Matakuliah{

    //Atribut
    private String idMatkul;
    private String namaMatkul;
    private int sks;

    //Methode 
    public Matakuliah(){
        this("","",0);
    }

    public Matakuliah(String idMatkul, String namaMatkul, int sks){
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    //Selektor
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNamaMatkul(){
        return namaMatkul;
    }

    public int getSks(){
        return sks;
    }

    //Mutator

    public void setIdMatkul(String idMatkul){
        this.idMatkul  = idMatkul;
    }

    public void setNamaMatkul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public void printMatkul() {
        System.out.println("Matakuliah: " + idMatkul + " - " + namaMatkul + " (" + sks + ")");
    }

}