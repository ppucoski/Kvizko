package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quiz {

  @Id
  private long quizid;
  private long categoryid;
  private String quizname;


  public long getQuizid() {
    return quizid;
  }

  public void setQuizid(long quizid) {
    this.quizid = quizid;
  }


  public long getCategoryid() {
    return categoryid;
  }

  public void setCategoryid(long categoryid) {
    this.categoryid = categoryid;
  }


  public String getQuizname() {
    return quizname;
  }

  public void setQuizname(String quizname) {
    this.quizname = quizname;
  }

}
