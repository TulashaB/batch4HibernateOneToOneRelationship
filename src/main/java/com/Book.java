package com;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Book {

	private int id;
	private String name;
	private String description;
	private int price;
	private Author author;   //id  name email
	
	public Book() {
		super();
		
	}
	public Book(String name, String description, int price, Author author) {
		super();
		
		this.name = name;
		this.description = description;
		this.price = price;
		this.author = author;
	}
	
	@Id
	@Column(name="book_id")
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
	public String getDescription() {
		return description;
		
	}
	public void setDescription(String description) {
		this.description = description;
		
	}
	public int getPrice() {
		return price;
		
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="author_Id")  //foreign key
	public Author getAuthor() {
		return author;
		
	}
	public void setAuthor(Author author) {
		this.author = author;
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", author="
				+ author + "]";
	}
}
	
	
	