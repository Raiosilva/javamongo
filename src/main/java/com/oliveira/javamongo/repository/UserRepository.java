package com.oliveira.javamongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.oliveira.javamongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
