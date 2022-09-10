package com.example.kaiser.controller;

import com.example.kaiser.dto.PostRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/postapi")
public class PostApiController  {

    @PostMapping("/post")
    public void post(@RequestBody PostRequest requestData) {
        System.out.println(requestData);
    }

}
