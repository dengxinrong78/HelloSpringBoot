package com.example.HelloSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  // 「/hello」へアクセスがあった場合
  @GetMapping("/hello")
  public String helloWorld() {
    // 文字列を返す
    return "Hello Spring-Boot World!!";
  }

}