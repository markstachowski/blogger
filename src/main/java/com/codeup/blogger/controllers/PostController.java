package com.codeup.blogger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @GetMapping("/posts")
  public String posts() {
    return "posts index page";
  }

  @GetMapping("/posts/{id}")
  public String postsID(@PathVariable long id) {
    return "posts index page " + id;
  }

  @GetMapping("/posts/create")
  public String postsCreate() {
    return "view the form for creating a post ";
  }

  @PostMapping("/posts/create")
  public String postsCreated() {
    return "create a new post ";
  }
}
