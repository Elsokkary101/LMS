package com.jts.LMS.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patron_borrow_book")

public class PatronBorrowBook {

	@Id
	private int id;
	private int book_id;
	private int patron_id;

	private Date due_date;

	private boolean status;


	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}


	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


	public int getId() {
		return id;
	}

	public int getPatron_id() {
		return patron_id;
	}

}
