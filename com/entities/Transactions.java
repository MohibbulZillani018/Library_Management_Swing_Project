package com.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Transactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trans_id;
	private LocalDate issue_date;
	private LocalDate due_date;
	private LocalDate return_date;
	private String trans_status;
	private double fine;
	
	
//	
//	public Transactions(LocalDate issue_date, LocalDate due_date, LocalDate return_date, String trans_status,
//			double fine) {
//		super();
//		this.issue_date = issue_date;
//		this.due_date = due_date;
//		this.return_date = return_date;
//		this.trans_status = trans_status;
//		this.fine = fine;
//	}

	public Transactions(LocalDate issue_date, LocalDate due_date, LocalDate return_date, String trans_status, double fine) {
		super();
		this.issue_date = issue_date;
		this.due_date = due_date;
		this.return_date = return_date;
		this.trans_status = trans_status;
		this.fine = fine;
		// TODO Auto-generated constructor stub
	}
	
	public Transactions() {
		
	}

	public void setMember(Members member) {
		// TODO Auto-generated method stub
		
	}

	public void setBook(Books book) {
		// TODO Auto-generated method stub
		
	}

	public Books getBook() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMember() {
		// TODO Auto-generated method stub
		return null;
	}







//	@ManyToOne(cascade = CascadeType.PERSIST)
//	private List<Books> book_list =new ArrayList<Books>();
//	
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	private List<Members> member_list =new ArrayList<Members>();
//	
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	private List<Librarians> librarian_list =new ArrayList<Librarians>();
	

}
