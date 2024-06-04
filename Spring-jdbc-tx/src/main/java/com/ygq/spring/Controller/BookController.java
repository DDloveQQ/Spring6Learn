package com.ygq.spring.Controller;

import com.ygq.spring.Service.BookService;
import com.ygq.spring.Service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

//    @Autowired
//    private BookService bookservice;


//    public void buyBook(Integer bookId, Integer userId) {
//        bookservice.buyBook(bookId, userId);
//    }

    @Autowired
    private CheckOutService checkOutService;

    public void checkout(Integer[] bookIds, Integer userId){
        checkOutService.checkout(bookIds, userId);
    }
}
