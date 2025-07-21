package com.operation;

import com.driver.Driver;
import com.entities.Books;
import com.entities.Members;
import com.entities.Transactions;

import java.time.LocalDate;
import java.util.List;

public class TransactionOperation {
    
    public static void issueBook(int bookId, int memberId) {
        Books book = Driver.em.find(Books.class, bookId);
        Members member = Driver.em.find(Members.class, memberId);
        
        if (book != null && member != null && book.getAvailable_copies() > 0) {
            Transactions transaction = new Transactions();
            transaction.setIssue_date(LocalDate.now());
            transaction.setDue_date(LocalDate.now().plusWeeks(2)); // Setting due date 2 weeks from issue date
            transaction.setTrans_status("Issued");
            transaction.setFine(0.0);
            transaction.setBook(book);
            transaction.setMember(member);
            
            Driver.et.begin();
            book.setAvailable_copies(book.getAvailable_copies() - 1);
            Driver.em.persist(transaction);
            Driver.em.merge(book);
            Driver.et.commit();
            
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book or Member not found, or no available copies!");
        }
    }
    
    public static void returnBook(int transactionId) {
        Transactions transaction = Driver.em.find(Transactions.class, transactionId);
        
        if (transaction != null && "Issued".equals(transaction.getTrans_status())) {
            Books book = transaction.getBook();
            transaction.setReturn_date(LocalDate.now());
            transaction.setTrans_status("Returned");
            
            Driver.et.begin();
            book.setAvailable_copies(book.getAvailable_copies() + 1);
            Driver.em.merge(book);
            Driver.em.merge(transaction);
            Driver.et.commit();
            
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Transaction not found or the book is not issued!");
        }
    }
    
    public static void viewIssuedBooks() {
        List<Transactions> transactions = Driver.em.createQuery("SELECT t FROM Transactions t WHERE t.trans_status = 'Issued'", Transactions.class).getResultList();
        for (Transactions transaction : transactions) {
            System.out.println("Transaction ID: " + transaction.getTrans_id());
            System.out.println("Book Title: " + transaction.getBook().getBook_Title());
//            System.out.println("Member Name: " + transaction.getMember().getMemName());
            System.out.println("Issue Date: " + transaction.getIssue_date());
            System.out.println("----------------------------------------");
        }
    }
    
    public static void viewTransactions() {
        List<Transactions> transactions = Driver.em.createQuery("SELECT t FROM Transactions t", Transactions.class).getResultList();
        for (Transactions transaction : transactions) {
            System.out.println("Transaction ID: " + transaction.getTrans_id());
            System.out.println("Book Title: " + transaction.getBook().getBook_Title());
//            System.out.println("Member Name: " + transaction.getMember().getMemName());
//            System.out.println(System.out.println("Issued: " + transaction.isIssued());
            System.out.println("----------------------------------------");
        }
    }
    
}