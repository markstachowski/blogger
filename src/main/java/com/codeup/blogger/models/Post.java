package com.codeup.blogger.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

  @Id @GeneratedValue
  private int id;

  @Column(nullable = false, length = 240)
  private String title;

  @Column(nullable = false)
  private String body;

  public Post() {}

  public Post(String title, String body) {
    this.title = title;
    this.body = body;
  }
  public Post(String title, String body,int id) {
    this(title,body);
    this.setId(id);
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
}