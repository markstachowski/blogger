package com.codeup.blogger.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RollDice {

  @GetMapping("/roll-dice/{n}")
  public String guess(@PathVariable int n, Model model) {
    int roll = (int) (Math.random() * 6) + 1;
    model.addAttribute("roll", roll);
    if (n == roll) {
      return n + " was the right number! " + roll + " was the roll on the dice.";
    } else if (n > roll) {
      return n + " too high! " + roll + " was the roll on the dice.";
    } else {
      return n + " too low! " + roll + " was the roll on the dice.";
    }
  }

}
