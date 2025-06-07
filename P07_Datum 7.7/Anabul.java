
public class Anabul{
    //Atribut
    private String nama;

    //Method
    public Anabul(String nama){
        this.nama = nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void gerak(){
        System.out.println("Hewan bergerak");
    }

    public void suara(){
        System.out.println("Hewan Bersuara");
    }
}