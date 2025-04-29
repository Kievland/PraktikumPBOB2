public class Anjing extends Anabul{

    public Anjing(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Anjing berjalan dengan 4 kaki");
    }

    @Override
    public void Suara(){
        System.out.println("Guk guk guk!!!");
    }
}