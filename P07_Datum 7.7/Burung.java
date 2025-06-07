public class Burung extends Anabul{

    public Burung(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println("Burung bergerak dengan terbang");
    }

    public void suara(){
        System.out.println("Cuit cuit cuit!!!");
    }
}