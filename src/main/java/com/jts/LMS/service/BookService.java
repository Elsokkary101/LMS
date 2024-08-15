package com.jts.LMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jts.LMS.entity.Book;
import com.jts.LMS.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;

	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}

	public Book findById(Integer id) {
		Optional<Book> book = bookRepo.findById(id);

		if (book.isEmpty())
			return null;
		
		return book.get();
	}

	public List<Book> findAllBooks() {
		List<Book> books = bookRepo.findAll();

		return books;

	}

	public Book updateBook(int id, Book book) {
		Optional<Book> foundBook = bookRepo.findById(id);

		if (foundBook.isEmpty())
			return null;
		
		Book rightBook = foundBook.get();

		rightBook.setTitle(book.getTitle());
		rightBook.setDate(book.getDate());
		rightBook.setAuthor(book.getAuthor());
		rightBook.setLanguage(book.getLanguage());
		rightBook.setShelf_location(book.getShelf_location());


		return bookRepo.save(rightBook);
	}

	public ResponseEntity<Object> deleteBook(int id) {
		Optional<Book> foundBook = bookRepo.findById(id);

		if (foundBook.isEmpty())
			return null;
		Book rightBook = foundBook.get();

		bookRepo.delete(rightBook);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
