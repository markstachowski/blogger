package com.codeup.blogger.services;

import com.codeup.blogger.models.Post;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PostService {
  private List<Post> posts;

  public PostService() {
    posts = new ArrayList<>();
    createPosts();
  }

  public List<Post> all() {
    return posts;
  }

  public Post findOne(int id) {
    return posts.get(id - 1);
  }

  public Post create(Post post) {
    post.setId(posts.size() + 1);
    posts.add(post);
    return post;
  }

  public Post edit(Post post) {
    post.setId(post.getId() - 1);
    posts.set(post.getId(), post);
//        Post pp = posts.get(post.getId() - 1);
//        pp.setTitle(post.getTitle());
//        pp.setBody(post.getBody());
    return post;
  }

  private void createPosts() {
    create(new Post("New Post 1", "lorem impsum dolor set amit"));
    create(new Post("New Post 2", "lorem impsum dolor set amit"));
    create(new Post("New Post 3", "lorem impsum dolor set amit"));
    create(new Post("New Post 4", "lorem impsum dolor set amit"));
    create(new Post("New Post 5", "lorem impsum dolor set amit"));
  }
}
