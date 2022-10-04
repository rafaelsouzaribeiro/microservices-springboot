package com.example.testes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.user.communication.PaymentCartCommunication;

//@Controller// This means that this class is a Controller
@RequestMapping("/testes")// This means URL's start with /demo (after Application path)
@RestController
public class TestesController {

  @GetMapping("/message")
  public String getHelloWorld()
  {
    return "Hello World testes";
  }

}


