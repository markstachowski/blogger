package com.codeup.blogger.controllers;

import com.codeup.blogger.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {

}
