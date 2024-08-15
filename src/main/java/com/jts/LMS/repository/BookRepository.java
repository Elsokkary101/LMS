package com.jts.LMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.LMS.entity.Book;

public interface BookRepository extends  JpaRepository<Book, Integer>{

}
