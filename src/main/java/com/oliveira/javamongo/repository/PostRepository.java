package com.oliveira.javamongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.oliveira.javamongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
