package com.driver;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.operation.*;

import com.entities.*;

public class Driver {
	
		
		public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LMS");
		public static EntityManager em = emf.createEntityManager();
		public static EntityTransaction et = em.getTransaction();
		
		
		
		   
		            public static void main(String[] args) {
		            	 
		            	Scanner sc=new Scanner(System.in);
		            	System.out.println("Welcome to Libraries Management ======");
		            	while(true) {
		            	System.out.println("1: Add book");
		            	System.out.println("2: Remove book");
		            	System.out.println("3: Exit");
		            	int ch=sc.nextInt();
		            	switch(ch){
		            	case 1:
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
		            	case 2:
		            	{
		            	
		            	}
		            	case 3:{
		            		System.out.println("Thanks");
		            		System.exit(0);
		            	}
		            		
		            	}
		            	
		            	}
	}
}