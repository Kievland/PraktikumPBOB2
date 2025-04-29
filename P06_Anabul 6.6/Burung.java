public class Burung extends Anabul{

    public Burung(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Burung bergerak dengan terbang");
    }

    public void Suara(){
        System.out.println("Cuit cuit cuit!!!");
    }
}