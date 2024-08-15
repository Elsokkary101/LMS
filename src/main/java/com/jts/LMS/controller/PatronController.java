package com.jts.LMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jts.LMS.entity.Patron;
import com.jts.LMS.service.PatronService;

@RestController
@RequestMapping("/api/patrons")
public class PatronController {

	  
    @Autowired
    private PatronService patronService;

    @GetMapping("")
    public List<Patron> getAllBooks() {
        return patronService.findAllPatrons();
    }


    @GetMapping("/{id}")
    public Patron getBookById(@PathVariable int id) {
        return patronService.findById(id);
    }


    @PostMapping("")
    public Patron addBook(@RequestBody Patron book) {
        return patronService.savePatron(book);
    }


    @PutMapping("/{id}")
    public Patron updateBook(@PathVariable int id, @RequestBody Patron book) {
        return patronService.updatePatron(id, book);
    }


    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
    	patronService.deletePatron(id);
    }
}
