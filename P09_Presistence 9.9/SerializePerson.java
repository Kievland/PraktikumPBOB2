import java.io.*;

/**
 * File: SerializePerson.java
 * Deskripsi: Program untuk serialisasi objek Person
 */
// class Person (didefinisikan ulang untuk tujuan serialisasi di file ini)

// class SerializePerson
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");

        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}