public class Kucing extends Anabul{

    public Kucing(String nama){
        super(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("kucing berjalan dengan 4 kaki");
    }

    @Override
    public void Suara(){
        System.out.println("Meong meong!!!");
    }
}