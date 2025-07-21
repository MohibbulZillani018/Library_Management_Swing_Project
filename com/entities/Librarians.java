package com.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Entity
@Data
public class Librarians {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lib_id;
	private String lib_name;
	private String lib_gmail;
	private long lib_phone;
	private String lib_password;
	
	
	




	public Librarians(String lib_name2, String lib_gmail2, long lib_phone2, String lib_password2) {
		super();
		this.lib_name = lib_name2;
		this.lib_gmail = lib_gmail2;
		this.lib_phone = lib_phone2;
		this.lib_password = lib_password2;
		// TODO Auto-generated constructor stub
	}
	
	public Librarians() {
		
	}



//	@OneToMany(cascade = CascadeType.PERSIST, mappedBy ="librarian_list")
//	private List<Transactions> transaction_list =new ArrayList<Transactions>();

}
