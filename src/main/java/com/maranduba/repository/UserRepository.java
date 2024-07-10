package com.maranduba.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maranduba.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	

}
