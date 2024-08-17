package com.learing.user.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learing.user.dto.Bookdto;
import com.learing.user.dto.ResponseDto;
import com.learing.user.dto.UserEntity;
import com.learing.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.DataInput;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;


@Service
public class UserService {

    //private static final Logger log = LogManager.getLogManager().getLogger(String.valueOf(UserService.class));
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll().stream().collect(Collectors.toList());
    }

    public Optional<UserEntity> getUserByID(UUID userID) {
        Optional<UserEntity> user;
        if (userRepository.findById(userID).isPresent()) {
            user = userRepository.findById(userID);
        } else {
            throw new RuntimeException("User is not present");
        }
        return user;
    }

    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public ResponseDto getAllBooksById(UUID userId) throws IOException {
        String url = "http://localhost:8080/api/v1/book/";
        HttpEntity<UUID> request = new HttpEntity<>(userId);
        //log.info(request.toString());
        ResponseEntity<Bookdto> response = restTemplate.getForEntity(url+userId, Bookdto.class);
        //log.info(response.toString());
        Bookdto bookdto = response.getBody();
        return new ResponseDto(bookdto);
    }

    public List<?> getAllBooks() {
       ResponseEntity<List> books = restTemplate.exchange("http://localhost:8080/api/v1/book", HttpMethod.GET, null, List.class);
        return books.getBody();
    }

}
