package com.github.ungoodman.gitlabcicdsample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/example")
public class ExampleController {
    @GetMapping
    public ResponseEntity<String> getHelloWorld(@RequestParam("name") String name) {
        return new ResponseEntity<>("Hello World! ".concat(name), HttpStatus.OK);
    }
}
