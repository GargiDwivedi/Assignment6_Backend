package com.Gargi.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gargi.model.Author;
import com.Gargi.model.Book;
import com.Gargi.repository.AuthorRepository;

@Service
@Transactional
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}

	
	 public Optional<Author> getAuthorById(int authorId) { 
		 return authorRepository.findById(authorId); 
	 }


	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}

	public void deleteAuthorById(int authorId) {
		authorRepository.deleteById(authorId);
	}


	public Optional<Book> findById(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}
}
