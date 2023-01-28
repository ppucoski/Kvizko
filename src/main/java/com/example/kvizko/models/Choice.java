package com.example.kvizko.models;

public class Choice {

  private long choiceid;
  private long questionid;
  private String iscorrect;
  private String choicetext;


  public long getChoiceid() {
    return choiceid;
  }

  public void setChoiceid(long choiceid) {
    this.choiceid = choiceid;
  }


  public long getQuestionid() {
    return questionid;
  }

  public void setQuestionid(long questionid) {
    this.questionid = questionid;
  }


  public String getIscorrect() {
    return iscorrect;
  }

  public void setIscorrect(String iscorrect) {
    this.iscorrect = iscorrect;
  }


  public String getChoicetext() {
    return choicetext;
  }

  public void setChoicetext(String choicetext) {
    this.choicetext = choicetext;
  }

}
