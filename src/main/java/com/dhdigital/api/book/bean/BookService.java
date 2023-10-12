package com.dhdigital.api.book.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.springframework.stereotype.Service;

import com.dhdigital.api.book.model.Books;

@Service("bookService")
public class BookService {
	
	public void getBookInfo(Exchange exchange) throws Exception{
		
		Message oMessage = exchange.getIn();
		
		Books booksIncoming = oMessage.getBody(Books.class);
		
		System.out.println(booksIncoming.toString());
		
		
		
	}

}
