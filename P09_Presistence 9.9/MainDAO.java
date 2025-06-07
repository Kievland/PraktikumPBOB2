/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Kievlan
 */
/**
 * File: MainDAO.java
 * Deskripsi: Main program untuk akses DAO
 */
public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
            System.out.println("Data Indra berhasil disimpan ke database!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
