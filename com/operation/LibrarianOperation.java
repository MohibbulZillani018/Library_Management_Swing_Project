package com.operation;

import java.util.List;

import com.driver.Driver;
import com.entities.Librarians;

public class LibrarianOperation {
	
	public static void addLibrarians(String lib_name, String lib_email, long lib_phone, String pwd) {
        Librarians Librarians = new Librarians();
        Librarians.setLib_name(lib_name);
        Librarians.setLib_gmail(lib_email);
        Librarians.setLib_phone(lib_phone);
        Librarians.setLib_password(pwd);
        
        Driver.et.begin();
        Driver.em.persist(Librarians);
        Driver.et.commit();
    }
    
    public static void updateLibrarians(int LibrariansId, String lib_name, String lib_email, long lib_phone, String pwd) {
        Librarians Librarians = Driver.em.find(Librarians.class, LibrariansId);
        if (Librarians != null) {
            Librarians.setLib_name(lib_name);
            Librarians.setLib_gmail(lib_email);
            Librarians.setLib_phone(lib_phone);
            Librarians.setLib_password(pwd);
            
            Driver.et.begin();
            Driver.em.merge(Librarians);
            Driver.et.commit();
        } else {
            System.out.println("Librarians not found!");
        }
    }
    
    public static void deleteLibrarians(int LibrariansId) {
        Librarians Librarians = Driver.em.find(Librarians.class, LibrariansId);
        if (Librarians != null) {
            Driver.et.begin();
            Driver.em.remove(Librarians);
            Driver.et.commit();
        } else {
            System.out.println("Librarians not found!");
        }
    }
    
    public static void viewLibrarianss() {
        List<Librarians> Librarianss = Driver.em.createQuery("SELECT l FROM Librarians l", Librarians.class).getResultList();
        for (Librarians Librarians : Librarianss) {
            System.out.println("Librarians ID: " + Librarians.getLib_id());
            System.out.println("Name: " + Librarians.getLib_name());
            System.out.println("Email: " + Librarians.getLib_gmail());
            System.out.println("Phone: " + Librarians.getLib_phone());
            System.out.println("Password: " + Librarians.getLib_password());
            System.out.println("----------------------------------------");
        }
    }

}
	
        

