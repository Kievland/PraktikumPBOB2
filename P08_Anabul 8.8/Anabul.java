// File: Anabul.java

public abstract class Anabul { 
    // Atribut
    protected String nama; 

    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Getter 
    public String getNama() {
        return nama;
    }

    public abstract void gerak(); 
    public abstract void bersuara(); 
}