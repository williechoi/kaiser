package com.example.kaiser.controller;

import com.example.kaiser.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")      // http://localhost:9090/api/get/hello
    public String getHello() {
        return "get Hello";
    }

    // Legacy
    @RequestMapping(path = "/hi", method = RequestMethod.GET)  // get
    public String hi() {
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{name}
    // http://localhost:9090/api/get/path-variable/spring
    // http://localhost:9090/api/get/path-variable/java
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name="name") String pathName) {
        System.out.println("PathVariable : " + pathName);
        return "hi " + pathName;
    }

    // http://localhost:9090/api/get/query-param?user=willie&usergroup=100
    @GetMapping(path="/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+ " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    // http://localhost:9090/api/get/strict-query-param?user=willie&email=willie@gt.com&age=30
    @GetMapping("strict-query-param")
    public String strictQueryParam(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    // http://localhost:9090/api/get/dto-query-param?user=willie&email=willie@gt.com&age=30
    // most popular method
    @GetMapping("dto-query-param")
    public String dtoQueryParam(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();

    }



}
