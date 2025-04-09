public class Lingkaran extends BangunDatar implements IResize{
    private double jarijari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double jarijari, String warna, String border){
        super(0,warna, border);
        this.jarijari = jarijari;
    }

    public double getJari(){
        return jarijari;
    }

    public void setJari(double jarijari){
        this.jarijari = jarijari;
    }

    public double getKeliling(){
        return 2 * jarijari * 3.14;
    }

    public double getLuas(){
        return 3.14 * Math.pow(jarijari,2);
    }

    public double getJari2(){
        return jarijari;
    }

    @Override
    public void zoomIn(){
        jarijari = jarijari * 1.1;
    }

    @Override
    public void zoomOut(){
        jarijari = jarijari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jarijari = jarijari * percent/100;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("jari jari lingkaran: " + jarijari);
        System.out.println("keliling lingkaran: " + getKeliling());
        System.out.println("Luas lingkaran: " + getLuas());
    }   

}