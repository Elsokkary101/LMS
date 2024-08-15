package com.jts.LMS.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jts.LMS.entity.PatronBorrowBook;

import com.jts.LMS.service.PatronBorrowBookService;
import com.jts.LMS.utils.ApiResponse;

@RestController
@RequestMapping("/api")
public class PatronBorrowBookController {
	
	PatronBorrowBookService pbbService;
	
	@PostMapping("borrow/{bookId}/patron/{patronId}")
	public ApiResponse<PatronBorrowBook> borrow (@PathVariable int bId, @PathVariable int pId , @RequestBody PatronBorrowBook pbb) {
		PatronBorrowBook pbbRes = pbbService.addNewBorrow(pbb);
		if (pbbRes == null) 
			return new ApiResponse<PatronBorrowBook>(false , "book ID  or Patron ID is not found");
		return new ApiResponse<PatronBorrowBook>(true, "Borrowed Successfully");
	}
	
	@PutMapping("return/{bookId}/patron/{patronId}")
	public ApiResponse<PatronBorrowBook> returnBook (@PathVariable int bId, @PathVariable int pId , @RequestBody PatronBorrowBook pbb) {
		PatronBorrowBook pbbRes = pbbService.addNewBorrow(pbb);
		if (pbbRes == null) 
			return new ApiResponse<PatronBorrowBook>(false , "book ID  or Patron ID is not found");
		return new ApiResponse<PatronBorrowBook>(true, "");
	}
}
