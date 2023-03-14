package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
	
	private int id;   //author-id<----@column(name="author-id)
	private String name;
	private String email;
	
	
	public Author() {
		super();
		
	}


	public Author(String name, String email) {
		super();
	
		this.name = name;
		this.email = email;
	}

@Id
@Column(name="author_Id")
@GeneratedValue
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	

}

