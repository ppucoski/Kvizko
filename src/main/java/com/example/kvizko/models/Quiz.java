package com.example.kvizko.models;


public class Quiz {

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
