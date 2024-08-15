package com.jts.LMS.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")

public class Book {
	@Id
	private int id;
	private String title;
	private String author;
	private int isbn;
	private String language;
	private Date publication_year;
	private String shelf_location;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getDate() {
		return publication_year;
	}

	public void setDate(Date date) {
		this.publication_year = date;
	}

	public String getShelf_location() {
		return shelf_location;
	}

	public void setShelf_location(String shelf_location) {
		this.shelf_location = shelf_location;
	}

	public int getId() {
		return id;
	}
}
