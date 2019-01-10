package com.codeup.blogger.controllers;

import com.codeup.blogger.models.Post;
import com.codeup.blogger.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  private PostService postService;

  public PostController(PostService ps) {
    this.postService = ps;
  }

  @GetMapping("/posts")
  public String index(Model model) {
    model.addAttribute("posts",postService.all());
    return "posts/index";
  }

  @GetMapping("/posts/{id}")
  public String show(@PathVariable int id, Model model) {
    model.addAttribute("post",postService.findOne(id));
    model.addAttribute("id", id);
    return "posts/show";

  }

  @GetMapping("/posts/create")
  public String create(Model model) {
    model.addAttribute("post", new Post());
    return "posts/create";
  }

  @PostMapping("/posts/create")
  public String save(@ModelAttribute Post post) {
    postService.save(post);
    return "redirect:http://localhost:8080/posts";
  }
}
