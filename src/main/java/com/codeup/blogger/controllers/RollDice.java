package com.codeup.blogger.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RollDice {

  @GetMapping("/roll-dice")
  public String home() {
    return "rolldice";
  }

  @GetMapping("/roll-dice/{n}")
  public String guess(@PathVariable int n, Model model) {
    int roll = (int) (Math.random() * 6) + 1;
    model.addAttribute("roll", roll);
    if (n == roll) {
      model.addAttribute("correct", roll);
    } else if (n > roll) {
      model.addAttribute("greater", roll);
    } else {
      model.addAttribute("lesser", roll);
    }
    return "rolldice";
  }

}
