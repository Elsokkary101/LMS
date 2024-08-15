package com.jts.LMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.LMS.entity.Patron;

public interface PatronRepository extends JpaRepository<Patron, Integer>{
	
}
