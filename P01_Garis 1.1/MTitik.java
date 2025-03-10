//Nama: Muhammad Kievlan Hakim
//NIM :24060123140184
//Lab :B2 Pemrograman Berorientasi Objek

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        T1.getAbsis();
        T1.getOrdinat();
        T1.printTitik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(3,5);

        System.out.println("Jumlah objek titik = " + Titik.getCountTitik());
        System.out.println("Jumlah objek titik = " + T1.getCountTitik());
        System.out.println("Kuadran titik T1 = " + T1.getKuadran());
        System.out.println("Jarak Titik T1 ke pusat = " + T1.getJarakPusat());
        System.out.println("Jarak Titik T3 ke Titik T1 = " + T3.getJarak(T1));
        
        T3.refleksiX();
        T3.printTitik();
        T3.refleksiY();
        T3.printTitik();
        Titik T4 = T3.getRefleksiX();
        T4.printTitik();

    }
    
}