package com.example.kvizko.models;


public class UserTable {

  private long userid;
  private String fullname;
  private String username;
  private String passwordAttr;


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPasswordAttr() {
    return passwordAttr;
  }

  public void setPasswordAttr(String passwordAttr) {
    this.passwordAttr = passwordAttr;
  }

}
