//Nama: Muhammad Kievlan Hakim
//NIM :24060123140184
//Lab :B2 Pemrograman Berorientasi Objek

public class Kendaraan{

    //Atribut
    private String noPlat;
    private String jenis;

    //Methode
    public Kendaraan(){
        this("","");
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Selektor
    public String setNoPlat(){
        return noPlat;
    }

    public String setJenis(){
        return jenis;
    }

    //Mutator
    public void getNoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    
    public void getJenis(String jenis){
        this.jenis = jenis;
    }

    public void printKendaraan() {
        System.out.println("Kendaraan: " + noPlat + " (" + jenis + ")");
    }
}