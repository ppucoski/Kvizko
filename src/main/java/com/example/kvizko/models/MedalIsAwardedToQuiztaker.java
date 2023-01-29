package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MedalIsAwardedToQuiztaker {

  @Id
  private long medalid;

  @Id
  private long userid;


  public long getMedalid() {
    return medalid;
  }

  public void setMedalid(long medalid) {
    this.medalid = medalid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

}
