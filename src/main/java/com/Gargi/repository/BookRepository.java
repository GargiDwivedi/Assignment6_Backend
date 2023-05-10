package com.Gargi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gargi.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
