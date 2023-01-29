package com.example.kvizko.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Selectedchoice {

  @Id
  private long selectedchoiceid;

  @Id
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
