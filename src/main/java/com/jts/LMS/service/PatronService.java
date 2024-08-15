package com.jts.LMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jts.LMS.entity.Patron;

import com.jts.LMS.repository.PatronRepository;

@Service
public class PatronService {
	@Autowired
	private PatronRepository patronRepo;

	public Patron savePatron(Patron patron) {
		return patronRepo.save(patron);
	}

	public Patron findById(Integer id) {
		Optional<Patron> patron = patronRepo.findById(id);

		if (patron.isEmpty())
			return null;
		return patron.get();
	}

	public List<Patron> findAllPatrons() {
		List<Patron> Patrons = patronRepo.findAll();

		return Patrons;

	}

	public Patron updatePatron(int id, Patron patron) {
		Optional<Patron> patrons = patronRepo.findById(id);

		if (patrons.isEmpty())
			return null;
		
		Patron rightpatron = patrons.get();

		return patronRepo.save(rightpatron);
	}

	public ResponseEntity<Object> deletePatron(int id) {
		Optional<Patron> patron = patronRepo.findById(id);

		if (patron.isEmpty())
			return null;
		Patron rightPatron = patron.get();

		patronRepo.delete(rightPatron);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}
