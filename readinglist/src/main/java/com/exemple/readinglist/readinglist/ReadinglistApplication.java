package com.exemple.readinglist.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
public class ReadinglistApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(ReadinglistApplication.class, args);
		ReadingListRepository readingListRepository = ctx.getBean(ReadingListRepository.class);
		Book b = new Book("baddi", "10001", "Spring Book","Youssef","description bla bla");
		readingListRepository.save(b);
		Book b2 = new Book("baddi", "10001", "Spring Book","Youssef","description bla bla");
		readingListRepository.save(b2);
		Book b3 = new Book("baddi", "10001", "Spring Book","Youssef","description bla bla");
		readingListRepository.save(b3);

		List<Book> readingList = readingListRepository.findAll();
		if(readingList != null){
		    readingList.forEach(book -> System.out.println(book.getTitle()));
		}

		List<Book> readingList1 = readingListRepository.findByReader("reader1");
		if(readingList1 != null){
			readingList1.forEach(book -> System.out.println(book.getTitle()));
		}
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/","/readingList");
	}
}
