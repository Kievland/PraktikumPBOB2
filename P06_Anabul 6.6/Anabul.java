
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

    public void Gerak(){
        System.out.println("Hewan bergerak");
    }

    public void Suara(){
        System.out.println("Hewan Bersuara");
    }
}