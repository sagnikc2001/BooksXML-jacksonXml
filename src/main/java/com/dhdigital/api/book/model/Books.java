package com.dhdigital.api.book.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.FIELD) //  specify the access type for fields when marshalling (converting an object to XML) or unmarshalling (converting XML to an object) in the context of XML binding.
@XmlRootElement(name = "book")  // Setting the XML root element to book -- <book>....</book>
public class Books {

	@XmlElement // For naming XML Element same as variable -- <isbn>....</isbn>
	private int isbn;

	@XmlElement
	private String bookName;

	@XmlElement
	private String author;

	@XmlElement
	private String genre;

	@XmlElement
	private int qty;

//	Getters and Setters

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

//	Default Constructor

	public Books() {
		super();
	}

//	Parameterized Constructor
	
	public Books(int isbn, String bookName, String author, String genre, int qty) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
		this.qty = qty;
	}

//	toString
	
	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + ", genre=" + genre + ", qty="
				+ qty + "]";
	}

	
}
