package com.maruf.repository;

import org.springframework.data.repository.CrudRepository;

import com.maruf.model.Books;

//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer> {
}
