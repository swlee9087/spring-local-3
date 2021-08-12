package com.example.dontwannawork.user.repository;

import com.example.dontwannawork.user.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends MongoRepository<User,Long> {
    List<User>findAllByName(String name);
}
