/*Nama: Muhammad Kievlan Hakim*/
/*NIM : 24060123140184*/
/*Praktikum: PBO B2*/

public class CivitasAkademika {
    protected String nama;
    protected String email;

    public CivitasAkademika() {
        this("", "");
    }

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}
