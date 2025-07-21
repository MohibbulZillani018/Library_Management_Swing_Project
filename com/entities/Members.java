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
public class Members {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mem_id;
	private String mem_name;
	private String mem_gmail;
	private long mem_phone;
	private String mem_address;



	public Members(String mem_name, String mem_gmail, long mem_phone, String mem_address) {
		super();
		this.mem_name = mem_name;
		this.mem_gmail = mem_gmail;
		this.mem_phone = mem_phone;
		this.mem_address = mem_address;
		// TODO Auto-generated constructor stub
	}
	
	public Members() {
		
	}



//	@OneToMany(cascade = CascadeType.PERSIST, mappedBy ="transaction_list")
//	private List<Transactions> transaction_list =new ArrayList<Transactions>();
	

}
