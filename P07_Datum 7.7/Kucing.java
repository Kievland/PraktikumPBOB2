public class Kucing extends Anabul{

    public Kucing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println("kucing berjalan dengan 4 kaki");
    }

    @Override
    public void suara(){
        System.out.println("Meong meong!!!");
    }
}