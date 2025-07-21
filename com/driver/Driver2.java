package com.driver;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entities.Publishers;
import com.operation.BookOperation;
import com.operation.LibrarianOperation;
import com.operation.MemberOperation;

public class Driver2 {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS");
	public static EntityManager em = emf.createEntityManager();
	public static EntityTransaction et = em.getTransaction();
	
	
	
	   
	            public static void main(String[] args) {
	            	 
	            	Scanner sc=new Scanner(System.in);
	            	System.out.println("Welcome to Libraries Management ");
	            	System.out.println("=============================== ");
	            	while(true) {
	            	System.out.println("1: Book");
	            	System.out.println("2: Member");
	            	System.out.println("3: Librarians");
	            	System.out.println("4: Transactions");
	            	System.out.println("5: publisher");
	            	System.out.println("6: Exit");
	            	int ch=sc.nextInt();
	            	switch(ch){
	            	case 1:  //Book Area
	            	{
	            		
	            		while(true) {
	    	            	System.out.println("1: Add a Book");
	    	            	System.out.println("2: Update a Book");
	    	            	System.out.println("3: Delete a Book");
	    	            	System.out.println("4: View a Book");
	    	            	System.out.println("5: Check Book Availability");
	    	            	System.out.println("6: Search Book");
	    	            	System.out.println("7: Exit");
	    	            	int ch2=sc.nextInt();
	    	            	switch(ch2){
	    	            	case 1:  //1.1 Add a Book
	    	            	{
	    	            		System.out.println("Enter book name");String bookname= sc.next();
	    	            		System.out.println("Enter publisher year" );int year=sc.nextInt();
	    	            		System.out.println("Enter copies ");int total=sc.nextInt();
	    	            		System.out.println("Enter pub name");String pubName=sc.next();
	    	            		System.out.println("Enter pub add");String add=sc.next();
	    	            		System.out.println("Publisher phno");long phone=sc.nextLong();
	    	            		System.out.println("Publisher email");String email=sc.next();
	    	            		
	    	            		BookOperation.addBook(bookname, year, total, total, new Publishers(pubName, add, email, phone));
	    	            		break;
	    	            	}
	    	            	case 2:  //1.2 Update a Book
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	case 3:  //1.3 Delete a Book
	    	            	{
	    	            	
	    	            		break;
	    	            	}
	    	            	case 4:  //1.4 View a Book
	    	            	{
	    	            	
	    	            		break;
	    	            	}
	    	            	case 5:  //1.5 Check a Book
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	case 6:  //1.6 Search a Book
	    	            	{
	    	            	
	    	            		break;
	    	            	}
	    	            	case 7:  // Exit 1.1
	    	            	{
	    	            		return;
	    	            	}
	    	            	}
	            		}
	            		
	            		
	            		
	            		
	            	}
	            	
	            	
	            	case 2:
{
	            		
	            		while(true) {
	    	            	System.out.println("1: Add a Member");
	    	            	System.out.println("2: Update a Member");
	    	            	System.out.println("3: Delete a Delete");
	    	            	System.out.println("4: View All Member");
	    	            	System.out.println("5: Exit");
	    	            
	    	            	int ch3=sc.nextInt();
	    	            	switch(ch3){
	    	            	case 1:  //1.1 Add a Member
	    	            	{
	    	            		System.out.println("Enter Member name");String mem_name= sc.next();
	    	            		System.out.println("Enter Member gmail" );String mem_mail=sc.next();
	    	            		System.out.println("Enter Member phone ");long mem_mob=sc.nextLong();
	    	            		System.out.println("Enter Member address");String mem_addr=sc.next();
	    	            		
	    	            		
	    	            		MemberOperation.addMember(mem_name, mem_mail, mem_mob, mem_addr);
	    	            		break;
	    	            	}
	    	            	case 2:  //2.2 Update a Member
	    	            	{
	    	            		break;
	    	            	}
	    	            	case 3:  //2.3 Delete a Member
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	case 4:  //2.4 View a Member
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	
	    	            	case 5:  // Exit 2.1
	    	            	{
	    	            		return;
	    	            	}
	    	            	}
	            		}
	            		
	            		
	            		
	            		
	            	}
	            	case 3:{
	            		
	            		while(true) {
	    	            	System.out.println("1: Add a Librarian");
	    	            	System.out.println("2: Update a Librarian Details");
	    	            	System.out.println("3: Delete Librarian Details");
	    	            	System.out.println("4: View all Librarian");
	    	            	System.out.println("5: Manage book Inventry");
	    	            	System.out.println("6: Exit");
	    	            	int ch4=sc.nextInt();
	    	            	switch(ch4){
	    	            	case 1:  //1.1 Add a Librarian
	    	            	{
	    	            		System.out.println("Enter librarian name");String lib_name= sc.next();
	    	            		System.out.println("Enter Librarian Email" );String lib_email=sc.next();
	    	            		System.out.println("Enter Librarian phno ");long lib_phone=sc.nextLong();
	    	            		System.out.println("Enter Librarian Password");String pwd=sc.next();
	    	            		
	    	            		
	    	            		LibrarianOperation.addLibrarians(lib_name, lib_email, lib_phone, pwd);
	    	            		break;
	    	            	}
	    	            	case 2:  //1.2 Update a Librarian Details
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	case 3:  //1.3 Delete a Librarian
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	case 4:  //1.4 View all Librarian
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	case 5:  //1.5 Manage Book Inventory
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	
	    	            	case 6:  // Exit 1.1
	    	            	{
	    	            		return;
	    	            	}
	    	            	}
	            		}
	            		
	            		
	            		
	            		
	            	}
	            	
                    case 4:{
	            		
	            		while(true) {
	    	            	System.out.println("1: Issue a Book");
	    	            	System.out.println("2: Return a Book");
	    	            	System.out.println("3: View Issued Book");
	    	            	System.out.println("4: View All Transaction");
	    	            	System.out.println("5: Exit");
	    	            	int ch5=sc.nextInt();
	    	            	switch(ch5){
	    	            	case 1:  //1.1 Issue a Book
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	case 2:  //1.2 Return a Book
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	case 3:  //1.3 View Issued Book
	    	            	{
	    	            		
	    	            		break;
	    	            	}
	    	            	case 4:  //1.4 View All Transaction
	    	            	{
	    	            	
	    	            		break;
	    	            	}
	    	            	
	    	            	case 5:  // Exit 1.1
	    	            	{
	    	            		return;
	    	            	}
	    	            	}
	            		}
	            		
	            		
	            		
	            		
	            	}

                    case 5:{
	
                    	break;
                    }
	            	case 6:{
	            		System.out.println("Thanks");
	            		System.exit(0);
	            	}
	            		
	            	}
	            	
	            	}
}




				
}
