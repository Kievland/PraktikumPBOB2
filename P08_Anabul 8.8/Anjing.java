public class Anjing extends Anabul { 

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() { 
        System.out.println(nama + " melata."); 
    }

    @Override
    public void bersuara() { 
        System.out.println(nama + " bersuara guk-guk."); 
    }
}