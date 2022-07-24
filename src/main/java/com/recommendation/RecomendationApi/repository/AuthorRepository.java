package com.recommendation.RecomendationApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recommendation.RecomendationApi.model.Author;
import com.recommendation.RecomendationApi.model.Book;

public interface AuthorRepository extends JpaRepository<Author,Integer>{

	public Author findAuthorByAuthorId(int id);

}
