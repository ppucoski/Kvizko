package com.example.kvizko.models;

public class Hint {

  private long hintid;
  private String hinttext;
  private long questionid;


  public long getHintid() {
    return hintid;
  }

  public void setHintid(long hintid) {
    this.hintid = hintid;
  }


  public String getHinttext() {
    return hinttext;
  }

  public void setHinttext(String hinttext) {
    this.hinttext = hinttext;
  }


  public long getQuestionid() {
    return questionid;
  }

  public void setQuestionid(long questionid) {
    this.questionid = questionid;
  }

}
