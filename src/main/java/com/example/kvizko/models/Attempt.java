package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Attempt {

  @Id
  private long attemptid;
  private long userid;
  private java.sql.Date attemptdate;
  private long quizid;


  public long getAttemptid() {
    return attemptid;
  }

  public void setAttemptid(long attemptid) {
    this.attemptid = attemptid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public java.sql.Date getAttemptdate() {
    return attemptdate;
  }

  public void setAttemptdate(java.sql.Date attemptdate) {
    this.attemptdate = attemptdate;
  }


  public long getQuizid() {
    return quizid;
  }

  public void setQuizid(long quizid) {
    this.quizid = quizid;
  }

}
