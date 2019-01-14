package com.codeup.blogger.services;

import com.codeup.blogger.controllers.PostRepository;
import com.codeup.blogger.models.Post;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private final PostRepository postDao;

  public PostService(PostRepository postDao) {
    this.postDao = postDao;
  }

  public List<Post> all() {
    return (List<Post>) postDao.findAll();
  }

  public Post findOne(int id) {
    return postDao.findOne(id);
  }

  public Post edit(Post post) {
    postDao.save(post);
    return post;
  }

  public Post delete(Post post) {
    postDao.delete(post);
    return post;
  }

}
