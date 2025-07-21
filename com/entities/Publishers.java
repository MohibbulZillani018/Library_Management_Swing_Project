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
public class Publishers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pub_id;
	private String pub_name;
	private String pub_add;
	private String pub_gmail;
	private long pub_phone;
	
	
	
	
	
	




	


	public Publishers(String pub_name, String pub_add, String pub_gmail, long pub_phone) {
		super();
		this.pub_name = pub_name;
		this.pub_add = pub_add;
		this.pub_gmail = pub_gmail;
		this.pub_phone = pub_phone;
	}













//	@OneToMany(cascade = CascadeType.PERSIST, mappedBy ="publisher_list")
//	private List<Books> book_list =new ArrayList<Books>();

}
