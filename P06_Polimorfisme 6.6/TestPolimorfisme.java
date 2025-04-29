/*Nama : Muhammad Kievlan Hakim*/
/*Nim  : 2406121340184*/
/*LAB  : PBO B2*/

import java.util.ArrayList;

public class TestPolimorfisme{
    public static void main(String[] args){
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for(Pegawai emp : emps){
            emp.tampilData();
        }
    }
}

/*Dalam kasus ini polimorfisme membuat code menjadi lebih fleksibel, 
dimana kita dapat menggunakan satu tipe data umum yang dalam kasus ini 
adalah Pegawai untuk merepresentasikan berbagai objek turunannya yaitu 
Manajer dan Programmer */

/*Jika ada penambahan pegawai4 dan pegawai5 yang muncul tanpa menggunakan polimorfisme,
maka kita tidak bisa menyimpan objek Manajer, Programmer, dan pegawai lain ke dalam satu 
variabel atau list bertipe Pegawai. Kita harus memperlakukan tiap jenis objek secara terpisah.*/