package com.codeup.blogger.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class User {

  @Id @GeneratedValue
  private int id;

  @NotBlank(message = "Username can not be blank")
  @Column(nullable = false, unique = true)
  private String username;

  @NotBlank(message = "Email can not be blank")
  @Column(nullable = false, unique = true)
  private String email;

  @NotBlank(message = "Password can not be blank")
  @Size(min = 8, message = "A password must be at least 8 characters.")
  @Column(nullable = false)
  private String password;

  public User() {}

  public User(int id, String username, String email, String password) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public User(User copy) {
    id = copy.id;
    email = copy.email;
    username = copy.username;
    password = copy.password;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
