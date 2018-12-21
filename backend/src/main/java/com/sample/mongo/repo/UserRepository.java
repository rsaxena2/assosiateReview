package com.sample.mongo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.mongo.document.Users;

public interface UserRepository extends MongoRepository <Users,Integer> {

	List <Users> findAll();
	List <Users> findAllByOrderByName();

}
	