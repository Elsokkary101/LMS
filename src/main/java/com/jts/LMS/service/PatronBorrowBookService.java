package com.jts.LMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jts.LMS.entity.Book;
import com.jts.LMS.entity.Patron;
import com.jts.LMS.entity.PatronBorrowBook;
import com.jts.LMS.repository.PatronBorrowBookRepositiory;

@Service
public class PatronBorrowBookService {
	@Autowired
	private PatronBorrowBookRepositiory pbbRepo;
	private PatronService patronService;
	private BookService bookService;
	
	public PatronBorrowBook addNewBorrow (PatronBorrowBook pbb) {
		Patron patron = patronService.findById(pbb.getPatron_id());
		Book book = bookService.findById(pbb.getBook_id());
		
		if (patron == null || book == null)
			return null;
		
		pbb.setStatus(true);
		
		return pbbRepo.save(pbb);
		
	}
	
	public PatronBorrowBook retunBorrow (int patron_id , int borrow_id ,PatronBorrowBook pbb) {
		Patron patron = patronService.findById(patron_id);
		Book book = bookService.findById(borrow_id);
		
		
		
		if (patron == null || book == null)
			return null;
		
		pbb.setStatus(false);
		
		return pbbRepo.save(pbb);
		
	}
	
	
	
	
}
