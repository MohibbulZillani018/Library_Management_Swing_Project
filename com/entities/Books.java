package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Books {
	
	public Books(String book_Title, int book_Publishing_year, int total_copies, int available_copies) {
		super();
		this.book_Title = book_Title;
		this.book_Publishing_year = book_Publishing_year;
		this.total_copies = total_copies;
		this.available_copies = available_copies;
		
	}
	

	public Books() {
		super();
	}


	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int book_Id;
	
	private String book_Title;
	private int book_Publishing_year;
	private int total_copies;
	private int available_copies;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Publishers publisher;
	
	
	
//	@OneToMany(cascade = CascadeType.PERSIST, mappedBy ="book_list")
//	private List<Transactions> transaction_list =new ArrayList<Transactions>();
//	
//	private List<Publishers> publisher_list =new ArrayList<Publishers>();
	

}
