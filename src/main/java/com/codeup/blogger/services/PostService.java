package com.codeup.blogger.services;

import com.codeup.blogger.models.PostRepository;
import com.codeup.blogger.models.Post;
import com.codeup.blogger.models.User;
import com.codeup.blogger.models.UserRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private final PostRepository postDao;
  private final UserRepository userDao;

  public PostService(PostRepository postDao, UserRepository userDao) {
    this.postDao = postDao;
    this.userDao = userDao;
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

  public void delete(Post post) {
    postDao.delete(post);
  }

  public User findUser(int id) {
    return userDao.findOne(id);
  }

  public User editUser(User user) {
     userDao.save(user);
     return user;
  }

  public void deleteUser(User user) {
    userDao.delete(user);
  }

}
