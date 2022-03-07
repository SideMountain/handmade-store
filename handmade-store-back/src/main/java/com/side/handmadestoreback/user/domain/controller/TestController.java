package com.side.handmadestoreback.user.domain.controller;

import com.side.handmadestoreback.user.domain.model.Item;
import com.side.handmadestoreback.user.domain.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

  @Autowired
  ItemService itemService;
  
  @GetMapping("/message")
  public Item getMessage() {
    Item item = itemService.getItemById("a5e0f46c-3a68-41b9-b88d-30b45616e0b2");
    return item;
  }
}
