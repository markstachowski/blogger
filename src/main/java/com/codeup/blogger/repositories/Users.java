package com.codeup.blogger.repositories;

import com.codeup.blogger.models.User;
import org.springframework.data.repository.CrudRepository;

public interface Users extends CrudRepository<User, Integer> {
  User findByUsername(String username);
}
