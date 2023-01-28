package com.example.kvizko.models;


public class Selectedchoice {

  private long selectedchoiceid;
  private long choiceid;
  private long attemptid;


  public long getSelectedchoiceid() {
    return selectedchoiceid;
  }

  public void setSelectedchoiceid(long selectedchoiceid) {
    this.selectedchoiceid = selectedchoiceid;
  }


  public long getChoiceid() {
    return choiceid;
  }

  public void setChoiceid(long choiceid) {
    this.choiceid = choiceid;
  }


  public long getAttemptid() {
    return attemptid;
  }

  public void setAttemptid(long attemptid) {
    this.attemptid = attemptid;
  }

}
