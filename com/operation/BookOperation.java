package com.operation;

import java.util.List;

import com.driver.Driver;
import com.entities.Books;
import com.entities.Publishers;

public class BookOperation extends Books {
	
	public static void addBook(String bookname, int publicationyear, int totalcopies,int availablecopies, Publishers publisher) {
		Books b=new Books();
		b.setBook_Title(bookname);
		b.setBook_Publishing_year(totalcopies);
		b.setTotal_copies(totalcopies);
		b.setAvailable_copies(availablecopies);
		b.setPublisher(publisher);
		
		Driver.et.begin();
		Driver.em.persist(b);
		Driver.et.commit();
		
		
		
	}
	
	
	public static void updateBookDetail(int bookId, String bookname, int publicationyear, int totalcopies, int availablecopies, Publishers publisher) {
        Books b = Driver.em.find(Books.class, bookId);
        if (b != null) {
            b.setBook_Title(bookname);
            b.setBook_Publishing_year(publicationyear);
            b.setTotal_copies(totalcopies);
            b.setAvailable_copies(availablecopies);
            b.setPublisher(publisher);
            
            Driver.et.begin();
            Driver.em.merge(b);
            Driver.et.commit();
        } else {
            System.out.println("Book not found!");
        }
    }
    
    public static void deleteBook(int bookId) {
        Books b = Driver.em.find(Books.class, bookId);
        if (b != null) {
            Driver.et.begin();
            Driver.em.remove(b);
            Driver.et.commit();
        } else {
            System.out.println("Book not found!");
        }
    }
    
    public static void viewBooks() {
        List<Books> books = Driver.em.createQuery("SELECT b FROM Books b", Books.class).getResultList();
        for (Books b : books) {
            System.out.println("Book ID: " + b.getBook_Id());
            System.out.println("Title: " + b.getBook_Title());
            System.out.println("Publishing Year: " + b.getBook_Publishing_year());
            System.out.println("Total Copies: " + b.getTotal_copies());
            System.out.println("Available Copies: " + b.getAvailable_copies());
            System.out.println("Publisher: " + b.getPublisher().getPub_name());
            System.out.println("----------------------------------------");
        }
    }
    
    public static void checkBookAvailable(int bookId) {
        Books b = Driver.em.find(Books.class, bookId);
        if (b != null) {
            System.out.println("Available Copies: " + b.getAvailable_copies());
        } else {
            System.out.println("Book not found!");
        }
    }
    
    public static void searchBook(String keyword) {
        List<Books> books = Driver.em.createQuery("SELECT b FROM Books b WHERE b.book_Title LIKE :keyword", Books.class)
            .setParameter("keyword", "%" + keyword + "%").getResultList();
        for (Books b : books) {
            System.out.println("Book ID: " + b.getBook_Id());
            System.out.println("Title: " + b.getBook_Title());
            System.out.println("Publishing Year: " + b.getBook_Publishing_year());
            System.out.println("Total Copies: " + b.getTotal_copies());
            System.out.println("Available Copies: " + b.getAvailable_copies());
            System.out.println("Publisher: " + b.getPublisher().getPub_name());
            System.out.println("----------------------------------------");
        }
    }


}
