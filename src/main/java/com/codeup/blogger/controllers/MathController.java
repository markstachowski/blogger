package com.codeup.blogger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

  @GetMapping("/add/{num1}/add/{num2}")
  public int add(@PathVariable int num1, @PathVariable int num2) {
    return num1 + num2;
  }

  @GetMapping("/sub/{num1}/from/{num2}")
  public int sub(@PathVariable int num1, @PathVariable int num2) {
    return num1 - num2;
  }

  @GetMapping("/div/{num1}/by/{num2}")
  public int div(@PathVariable int num1, @PathVariable int num2) {
    return num1 / num2;
  }

  @GetMapping("/mult/{num1}/and/{num2}")
  public int mult(@PathVariable int num1, @PathVariable int num2) {
    return num1 * num2;
  }
}
