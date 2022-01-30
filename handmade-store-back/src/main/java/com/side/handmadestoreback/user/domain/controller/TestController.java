package com.side.handmadestoreback.user.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
  
  @GetMapping("/message")
  public String getMessage() {
    return "message2";
  }
}
