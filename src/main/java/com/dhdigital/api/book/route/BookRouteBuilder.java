package com.dhdigital.api.book.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.dhdigital.api.book.model.Books;

@Component
public class BookRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		restConfiguration().bindingMode(RestBindingMode.auto);

		rest("/books")
		
//		POST method to get books data by giving isbn - http://localhost:8080/api/books/get
		
		.post("/get")
		  .type(Books.class)
//		  .outType(Books.class)
		  .consumes("application/xml")
		  .produces("application/xml")
		  .to("direct:invoke");
		
		
		from("direct:invoke")
		 .marshal().jacksonXml() // Marshalling to XML
//		 .log("Log1 : ${body}")
		 .to("https://058a98e5-203e-4e80-a84e-df906be7f01b.mock.pstmn.io/get?bridgeEndpoint=true") // Sending the XML request to the Postman mock API to get data in XML format
//		 .log("Log2 : ${body}")
		 .to("bean:bookService?method=getBookInfo"); // Sending body to getBookInfo method for getting POJO
//		 .log("Log3 : ${body}");
		
	}

}
