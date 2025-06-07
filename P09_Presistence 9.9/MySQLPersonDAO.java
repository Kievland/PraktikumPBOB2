/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Kievlan
 */
import java.sql.*;

/**
 * File: MySQLPersonDAO.java
 * Deskripsi: implementasi PersonDAO untuk MySQL
 */
import java.sql.*; // Pastikan ini ada

public class MySQLPersonDAO implements PersonDAO { // Hapus 'abstract' di sini
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        // membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver"); // Menggunakan cj untuk versi MySQL Connector/J 8.x ke atas
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/pbo", "root", "131331"); // Pastikan username dan password sesuai
        // kerjakan mysql query
        String query = "INSERT INTO person (name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        // tutup koneksi database
        con.close();
    }
}
