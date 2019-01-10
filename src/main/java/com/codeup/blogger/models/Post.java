package com.codeup.blogger.models;

public class Post {

  private String title;
  private String body;
  private int id;

  public Post() {
  }

  public Post(String title, String body) {
    this.title = title;
    this.body = body;
  }
  public Post(String title, String body, int id) {
    this(title, body);
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