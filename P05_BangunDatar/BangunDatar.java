public abstract class BangunDatar{
    protected int jmlsisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlsisi, String warna, String border){
        this.jmlsisi = jmlsisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlsisi;
    }

    public void setJmlSisi(int jmlsisi){
        this.jmlsisi = jmlsisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public abstract double getLuas();
    
    public abstract double getKeliling();

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek BangunDatar yang dibuat: " + counterBangunDatar);
    }

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling  ();
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlsisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
        
    }   

}