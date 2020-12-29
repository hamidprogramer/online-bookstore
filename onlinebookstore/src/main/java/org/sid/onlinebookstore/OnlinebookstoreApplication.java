package org.sid.onlinebookstore;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;

import org.sid.onlinebookstore.entity.Book;
import org.sid.onlinebookstore.entity.BookCategory;
import org.sid.onlinebookstore.repository.BookCategoryRepository;
import org.sid.onlinebookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlinebookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinebookstoreApplication.class, args);
	}
	@Bean
	CommandLineRunner start (BookRepository bookRepository , BookCategoryRepository bookCategoryRepository) 
	{
		return args->{
			
			/*Stream.of("ila mata","the art of not giving a fuck", "sindibad","kitab hayati","ramon","mawde","hay latini","kifa").forEach(b->{
			 BookCategory bc=new BookCategory();
			 bc.setCategoryName(b);
	
			bookRepository.save(new Book(null,"root","disputed","por disputer","http://url",new BigDecimal(4905.1),true,50,null,null,bc));});
			 bookRepository.findAll();*/
			
		  BookCategory cat=bookCategoryRepository.save(new BookCategory(null,"action",null));
		  BookCategory cate=bookCategoryRepository.save(new BookCategory(null,"aventure",null));
		  bookRepository.save(new Book(null,"root","disputed","por disputer","assets/images/books/text-2.jpg",new BigDecimal(4905.1),true,50,new Date(),new Date(),cat));
		  bookRepository.save(new Book(null,"root","draxter","laboratoire de daxtar","assets/images/books/text-3.jpg",new BigDecimal(4905.1),true,50,new Date(),new Date(),cate));
		  bookRepository.save(new Book(null,"root","7to word","tell me about un history","assets/images/books/text-4.jpg",new BigDecimal(4905.1),true,50,new Date(),new Date(),cat));
		  bookRepository.save(new Book(null,"root","no more","more and more","assets/images/books/text-5.jpg",new BigDecimal(4905.1),true,50,new Date(),new Date(),cate));
		  
		  
		};
		
		
			
		
	}

}
