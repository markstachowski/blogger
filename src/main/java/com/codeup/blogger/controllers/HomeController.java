package com.codeup.blogger.controllers;

import com.codeup.blogger.quotes.Quote;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/") // the piece of URL we're listening for
  public String home(Model model) {
    int number = (int) Math.floor(Math.random() * 200) + 1;

    Quote[] quotes = Quote.getAllQuotes();

    model.addAttribute("number", number);
    model.addAttribute("quotes", quotes);

    return "home";
  }

}
