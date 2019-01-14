package com.codeup.blogger.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Post {

  @Id @GeneratedValue
  private int id;

  @Column(nullable = false, length = 240)
  private String title;

  @Column(nullable = false, length = 10000)
  private String body;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id")
  private User owner;

  public Post() {}

  public Post(String title, String body) {
    this.title = title;
    this.body = body;
  }

  public Post(String title, String body,int id) {
    this(title,body);
    this.setId(id);
  }

  public Post(String title, String body, User owner, int id) {
    this.title = title;
    this.body = body;
    this.owner = owner;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }
}