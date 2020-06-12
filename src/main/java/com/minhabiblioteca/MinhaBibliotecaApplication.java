package com.minhabiblioteca;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MinhaBibliotecaApplication implements CommandLineRunner {
	@Autowired
	private BooksRepository booksRepository;

	@Override
	public void run(String... args) throws Exception {
		List<Book> books = booksRepository.findAll();
		System.out.println(books.get(0).getName());
	}
    public static void main(String[] args) {

        SpringApplication.run(MinhaBibliotecaApplication.class, args);
    }

}
