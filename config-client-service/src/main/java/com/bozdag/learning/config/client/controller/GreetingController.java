package com.bozdag.learning.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @Value("${greet.name}")
  private String greeting;

  @Value("${config-client.magic-number}")
  private int magicNumber;

  @GetMapping("/greetings")
  public ResponseEntity<String> getGreeting() {
    return ResponseEntity.ok(buildGreeting());
  }

  @GetMapping("/magic")
  public ResponseEntity<Integer> getMagicNumber() {
    return ResponseEntity.ok(magicNumber);
  }

  private String buildGreeting() {
    return "Hello " + greeting;
  }
}
