package com.learing.user.repository;

import com.learing.user.dto.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.UUID;

@EnableMongoRepositories
public interface UserRepository extends MongoRepository<UserEntity, UUID> {

}
