package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Badge {

  @Id
  private long badgeid;
  private String badgename;
  private String description;
  private long resultid;


  public long getBadgeid() {
    return badgeid;
  }

  public void setBadgeid(long badgeid) {
    this.badgeid = badgeid;
  }


  public String getBadgename() {
    return badgename;
  }

  public void setBadgename(String badgename) {
    this.badgename = badgename;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getResultid() {
    return resultid;
  }

  public void setResultid(long resultid) {
    this.resultid = resultid;
  }

}
