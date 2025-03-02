//Nama: Muhammad Kievlan Hakim
//NIM :24060123140184
//Lab :B2 Pemrograman Berorientasi Objek

import java.util.ArrayList;
public class MMahasiswa{
    public static void main(String[] args){
        Dosen dosenA = new Dosen("198512042000051198","Dr. Agus","Informatika");
        Dosen dosenB = new Dosen("196901241990081023","Dr. Alif","Informatika");
        Dosen dosenC = new Dosen("198505272004111432","Dr. Bayu","Informatika");

        Matakuliah matkul1 = new Matakuliah("PAIK6402","Jaringan Komputer",3);
        Matakuliah matkul2 = new Matakuliah("PAIK6302","Sistem Operasi",3);
        Matakuliah matkul3 = new Matakuliah("PAIK6303","Basis Data",4);

        Kendaraan kendaraan1 = new Kendaraan("B200NPC","Motor");
        Kendaraan kendaraan2 = new Kendaraan("A175CUL","Mobil");
        Kendaraan kendaraan3 = new Kendaraan("D205PAL","Motor");

        Mahasiswa mahasiswaA = new Mahasiswa("70001245870134","Qeis","Informatika");
        Mahasiswa mahasiswaB = new Mahasiswa("70001245650245","Deni","Informatika");
        Mahasiswa mahasiswaC = new Mahasiswa("70001245650168","Dio","Informatika");


        mahasiswaA.setDosenWali(dosenA);
        mahasiswaB.setDosenWali(dosenB);
        mahasiswaC.setDosenWali(dosenC);

        mahasiswaA.setKendaraan(kendaraan1);
        mahasiswaB.setKendaraan(kendaraan2);
        mahasiswaC.setKendaraan(kendaraan3);

        mahasiswaA.addMatKul(matkul1);
        mahasiswaA.addMatKul(matkul2);
        mahasiswaA.addMatKul(matkul3);

        mahasiswaB.addMatKul(matkul1);
        mahasiswaB.addMatKul(matkul2);
        mahasiswaB.addMatKul(matkul3);

        mahasiswaC.addMatKul(matkul1);
        mahasiswaC.addMatKul(matkul2);
        mahasiswaC.addMatKul(matkul3);
        
        System.out.println("============================================================");
        mahasiswaA.printDetailMhs();
        mahasiswaB.printDetailMhs();
        mahasiswaC.printDetailMhs();
        System.out.println("============================================================");

    }
}