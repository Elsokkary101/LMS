package com.jts.LMS.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patron")

public class Patron {
	@Id
	private int id;
	private String name;

	private String email;
	private int phone_number;
	private Date birth_date;
	private int out_standing_fines;

	public int getId() {
		return id;
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

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public int getOut_standing_fines() {
		return out_standing_fines;
	}

	public void setOut_standing_fines(int out_standing_fines) {
		this.out_standing_fines = out_standing_fines;
	}
}
