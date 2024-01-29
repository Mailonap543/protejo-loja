package com.loja.rock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsuarioController {

  @GetMapping("/hello")
  public String helloWorld(){
    return "HELLO WORLD";
  }
}
