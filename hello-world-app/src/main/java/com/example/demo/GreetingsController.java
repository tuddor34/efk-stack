package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class GreetingsController {

  private static final Logger log = LoggerFactory.getLogger(GreetingsController.class);
  private static Random r = new Random();

  @GetMapping("/greetings")
  public ResponseEntity<Map<String, Integer>> greetings() {

    int randomNumber = r.nextInt();
    log.info("Request received. Generating random number: {}", randomNumber);
    Map<String, Integer> resp = new HashMap<>();
    resp.put("random number", randomNumber);
    return ResponseEntity.ok(resp);
  }
}
