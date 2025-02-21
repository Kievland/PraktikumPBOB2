//Nama: Muhammad Kievlan Hakim
//NIM :24060123140184
//Lab :B2 Pemrograman Berorientasi Objek

 public class Titik{
    //Atribut
    double absis;
    double ordinat;
    static int counterTitik;

    //Methode
    //Konstruktor untuk membuat titik(0,0)
    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    Titik(){
        this(0,0);
    }

    static int getCountTitik(){
        return counterTitik;
    }

    //Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y){
        absis += x;
        ordinat += y;
    }

    //Mendapatkan nilai kuadran dari nilai absis dan ordinat
    int getKuadran(){
        if (this.getAbsis() > 0 && this.getOrdinat() > 0){
            return 1;
        }else if(this.getAbsis() < 0 && this.getOrdinat() > 0){
            return 2;
        }else if(this.getAbsis() < 0 && this.getOrdinat() < 0){
            return 3;
        }else if(this.getAbsis() == 0 && this.getOrdinat() == 0){
            return 0;
        }else{
            return 4;
        }
    }

    //Menentukan jarak titik ke pusat
    double getJarakPusat() {
        return Math.sqrt((this.getAbsis() * this.getAbsis()) + (this.getOrdinat() * this.getOrdinat()));
    }

    //Menentukan jarak dari titik
    double getJarak(Titik T){
        return Math.sqrt(Math.pow((T.getAbsis() - this.getAbsis()),2) + Math.pow((T.getOrdinat() - this.getOrdinat()),2));
    }

    //Merefleksikan titik terhadap sumbu x
    void refleksiX(){
        this.ordinat = this.getOrdinat() * -1;
    }

    //Merefleksikan titik terhadap sumbu y
    void refleksiY(){
        this.absis = this.getAbsis() * -1;
    }

    //Mencetak koordinat titik
    void printTitik(){
        System.out.println ("Titik (" + absis + "," + ordinat + ")");
    }

    void printCountTitik(){
        System.out.println(this.counterTitik);
    }

    Titik getRefleksiX() {
        return new Titik(this.getAbsis(), this.getOrdinat() * -1);
    }

    Titik getRefleksiY() {
        return new Titik(this.getAbsis() * -1, this.getOrdinat());
    }

    

}