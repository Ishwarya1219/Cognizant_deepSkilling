package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
    	
    	        System.out.println("Main method started"); // 🔍 debug print

    	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    	        BookService bookService = (BookService) context.getBean("bookService");
    	        bookService.issueBook("ATOMIC HABITS");
    	    }
    	

    
}
