package com.minhabiblioteca;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.BooksRepository;

import java.util.List;

@SpringBootApplication
public class MinhaBibliotecaApplication implements CommandLineRunner {
	@Autowired(required=true)
	private BooksRepository booksRepository;

	@Override
	public void run(String... args) throws Exception {
		List<Book> books = booksRepository.findAll();
		System.out.println("Rodou");
	}
    public static void main(String[] args) {

        SpringApplication.run(MinhaBibliotecaApplication.class, args);
    }

}
