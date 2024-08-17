package com.learing.user.service;

import com.learing.user.dto.Bookdto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@FeignClient(url = "http://localhost:8080/",path = "/api/v1/",name = "books")
public interface UserClient {

    @GetMapping("/book/{id}")
    Bookdto getBookByID(@PathVariable UUID id);
}
