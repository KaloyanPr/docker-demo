package com.kaloyanpr.demo.docker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @GetMapping("/hello")
  public ResponseEntity<String> helloEndpoint() {
    return new ResponseEntity<>("Hello from docker!", HttpStatus.OK);
  }

  @GetMapping("/bye")
  public ResponseEntity<String> byeEndpoint() {
    return new ResponseEntity<>("Bye from docker!", HttpStatus.OK);
  }
}
