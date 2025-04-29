
public class main{
    public static void main(String[] args){
        Anabul peliharaan1 = new Kucing("Garfield");
        Anabul peliharaan2 = new Anjing("Pluto");
        Anabul peliharaan3 = new Burung("Humming Bird");

        System.out.println("Hewan pelihaaraan 1");
        peliharaan1.Gerak();
        peliharaan1.Suara();

        System.out.println("\nHewan pelihaaraan 2");
        peliharaan2.Gerak();
        peliharaan2.Suara();
        
        System.out.println("\nHewan pelihaaraan 3");
        peliharaan3.Gerak();
        peliharaan3.Suara();

    }
}