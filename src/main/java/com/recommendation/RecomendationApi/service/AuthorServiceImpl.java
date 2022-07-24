package com.recommendation.RecomendationApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recommendation.RecomendationApi.model.Author;
import com.recommendation.RecomendationApi.model.Book;
import com.recommendation.RecomendationApi.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorRepository authorRepository;
	
	
	public List<Author> getAllAuthors() {
		List<Author> authors = authorRepository.findAll();
		return authors;
	}


	@Override
	public Author getAuthorById(int authorid) {
		Author a= authorRepository.findAuthorByAuthorId(authorid);
		return a;
	}


	@Override
	public Author addAuthor(Author author) {
		// TODO Auto-generated method stub
		Author SavedAuthor= authorRepository.save(author);		
		return SavedAuthor;
	}
	
	

}
