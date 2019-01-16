package com.codeup.blogger.services;

import com.codeup.blogger.models.User;
import com.codeup.blogger.models.UserWithRoles;
import com.codeup.blogger.repositories.Users;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsLoader implements UserDetailsService {
  private final Users users;

  public UserDetailsLoader(Users users) {
    this.users = users;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = users.findByUsername(username);
    if (user == null) {
      throw new UsernameNotFoundException("No user found for " + username);
    }

    return new UserWithRoles(user);
  }
}