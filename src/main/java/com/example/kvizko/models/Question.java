package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Question {

  @Id
  private long questionid;
  private String questiontext;


  public long getQuestionid() {
    return questionid;
  }

  public void setQuestionid(long questionid) {
    this.questionid = questionid;
  }


  public String getQuestiontext() {
    return questiontext;
  }

  public void setQuestiontext(String questiontext) {
    this.questiontext = questiontext;
  }

}
