package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BadgeIsAwardedToQuiztaker {

  @Id
  private long badgeid;

  @Id
  private long userid;


  public long getBadgeid() {
    return badgeid;
  }

  public void setBadgeid(long badgeid) {
    this.badgeid = badgeid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

}
