package com.example.demo.repository;

import com.example.demo.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {


    UserModel findByEmail(String email);
}
